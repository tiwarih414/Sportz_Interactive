package com.example.himanshu_test.home.respository

import androidx.lifecycle.MutableLiveData
import com.example.himanshu_test.home.model.HeatModel
import com.example.himanshu_test.webConfig.RestService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TeamRepository {

    private var restService = RestService()
    var heatListData: MutableLiveData<HeatModel> = MutableLiveData()
    var heatStrData: String = String()

    fun getHeatData() {
        restService.service?.getHeat()
            ?.enqueue(object : Callback<HeatModel> {
                override fun onResponse(call: Call<HeatModel>, response: Response<HeatModel>) {
                    if (response.isSuccessful) {
                        heatListData.value = response.body()
                        heatStrData = response.body().toString()
                    }
                }

                override fun onFailure(call: Call<HeatModel>, t: Throwable) {
                    println("Himanshu Failure : $t")
                    heatListData.value = null
                }
            })
    }

}