package com.example.vv.test;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by vv on 25.04.2017.
 */
public interface TestApi {
    @GET("/test.php")
    Call<Example> getData();
}
