package com.example.todomvvmsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {


    @SerializedName("resultObj")
    @Expose
    ResultObj ResultObj;




    public com.example.todomvvmsample.model.ResultObj getResultObj() {
        return ResultObj;
    }

    public void setResultObj(com.example.todomvvmsample.model.ResultObj resultObj) {
        ResultObj = resultObj;
    }
}
