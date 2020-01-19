package com.example.todomvvmsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.todomvvmsample.model.Container;
import com.example.todomvvmsample.model.Metadata;
import com.example.todomvvmsample.model.Result;
import com.example.todomvvmsample.model.ResultObj;
import com.example.todomvvmsample.retrofit.ApiService;
import com.example.todomvvmsample.retrofit.RetrofitClient;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private ListView listViewMenu;

    ApiService apiInterface;

    List<String> mList=new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMenu=findViewById(R.id.listViewMenu);

        adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,mList);
       // listViewMenu.setAdapter(adapter);




        apiInterface = RetrofitClient.getClient().create(ApiService.class);

       Call<Result> responseString= apiInterface.getConfig("ANDROID_PHONE");


       responseString.enqueue(new Callback<Result>() {
           @Override
           public void onResponse(Call<Result> call, Response<Result> response) {

               if(response!=null){
                   Log.i("Response Success"," ++++");
                   ResultObj resultObj= response.body().getResultObj();
                   Log.i("Response Result",""+resultObj);

                  List<Container> containerList= resultObj.getMenu().getContainers();


                  for(int i=0;i<containerList.size();i++){
                     Metadata metadata= containerList.get(i).getMetadata();
                   String label=  metadata.getLabel();

                   mList.add(label);

                      Log.i("Response label",""+label);

                  }


                   listViewMenu.setAdapter(adapter);



               }
               Log.i("Response Success",response.toString());




           }

           @Override
           public void onFailure(Call<Result> call, Throwable t) {

               Log.i("Response Failure"," -----");

           }
       });

    }
}
