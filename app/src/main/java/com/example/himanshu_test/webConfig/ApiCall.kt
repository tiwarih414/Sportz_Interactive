package com.example.himanshu_test.webConfig

import com.example.himanshu_test.home.model.HeatModel
import com.example.himanshu_test.home.model.ScorchersModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiCall {

    @GET("sapk01222019186652.json")
    fun getSochers(): Call<ScorchersModel>

    @Headers("Content-Type:application/json")
    @GET("nzin01312019187360.json")
    fun getHeat(): Call<HeatModel>

}