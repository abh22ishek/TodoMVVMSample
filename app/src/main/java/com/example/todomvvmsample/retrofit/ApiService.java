package com.example.todomvvmsample.retrofit;

import com.example.todomvvmsample.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

  //  @GET("/AGL/1.4/A/E/{platform}/ALL/INITIAL/CONFIG")
    //Call<String> getConfig(@Path("platform") String platform);


    @GET("/AGL/1.4/A/E/{platform}/ALL/INITIAL/CONFIG")
    Call<Result> getConfig(@Path("platform") String platform);

}
