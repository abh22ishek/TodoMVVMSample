package com.example.todomvvmsample.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {



    private static Retrofit retrofit = null;


    public static Retrofit getClient() {


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        retrofit = new Retrofit.Builder()
                .baseUrl("https://apidev.sonyliv.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();



        return retrofit;
    }







    //now making the call object
    //Here we are using the api method that we created inside the api interface
   // Call<List<Hero>> call = api.getHeroes();

    /*//then finallly we are making the call using enqueue()
    //it takes callback interface as an argument
    //and callback is having two methods onRespnose() and onFailure
    //if the request is successfull we will get the correct response and onResponse will be executed
    //if there is some error we will get inside the onFailure() method
        call.enqueue(new Callback<List<Hero>>() {
        @Override
        public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {

            //In this point we got our hero list
            //thats damn easy right ;)
            List<Hero> heroList = response.body();

            //now we can do whatever we want with this list

        }

        @Override
        public void onFailure(Call<List<Hero>> call, Throwable t) {
            Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    });
*/
}
