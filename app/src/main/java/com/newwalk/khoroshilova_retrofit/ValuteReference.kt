package com.newwalk.khoroshilova_retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ValuteReference {
@GET("4/11/2020")
fun getValutes(@Path): Call<MutableList<Base>>

}