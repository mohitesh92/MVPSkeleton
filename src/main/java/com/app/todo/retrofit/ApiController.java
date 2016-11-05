package com.app.todo.retrofit;

import android.content.Context;

/**
 * Created by mohitesh on 03/11/16.
 */
public class ApiController {

    private final ApiService apiService;

    public ApiController(Context context, ApiService apiService) {
        this.apiService = apiService;
    }
}
