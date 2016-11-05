package com.app.todo.retrofit;


import com.app.todo.model.TaskResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mohitesh on 03/12/16.
 * Custom interface to declare all API calls
 */
public interface ApiService {

    @GET("u/6890301/tasks.json")
    Call<TaskResponse> fetchAllTasks();

}
