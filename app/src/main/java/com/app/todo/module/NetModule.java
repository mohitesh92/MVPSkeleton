package com.app.todo.module;

import android.content.Context;

import com.github.aurae.retrofit2.LoganSquareConverterFactory;
import com.app.todo.retrofit.ApiController;
import com.app.todo.retrofit.ApiService;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Module
public class NetModule {

    private final String mBaseUrl;

    // Constructor needs one parameter to instantiate.
    public NetModule(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }


    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Context context) {
        OkHttpClient.Builder okhttp = new OkHttpClient.Builder();
        okhttp.connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS);

        return okhttp.build();
    }

    @Provides
    @Singleton
    LoganSquareConverterFactory provideConverter() {
        return LoganSquareConverterFactory.create();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient, LoganSquareConverterFactory loganSquareConverterFactory) {
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(loganSquareConverterFactory)
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    ApiController providesApiController(Context context, ApiService apiService) {
        return new ApiController(context, apiService);
    }
}
