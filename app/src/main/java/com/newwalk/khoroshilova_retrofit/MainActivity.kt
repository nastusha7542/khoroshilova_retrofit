package com.newwalk.khoroshilova_retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object NetworkPoint{
    val VALUTES :ValuteReference
    get() = RetrofitClient.retrofit!!.create(ValuteReference::class.java)
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetworkPoint.VALUTES.getValutes().enqueue(object : Callback<MutableList<Valute>>{
            override fun onFailure(call: Call<MutableList<Valute>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<MutableList<Valute>>,
                response: Response<MutableList<Valute>>
            ) {

            }
        })
    }

}