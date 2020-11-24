package com.newwalk.khoroshilova_retrofit

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitClient {
  var retrofit: Retrofit? = null
      get() {
        if (field==null) {
            field=Retrofit.Builder()
                .baseUrl("https://www.cbr.ru/scripts/XML_daily.asp?date_req=02/03/2002" )
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build()
        }
        return field
    }

}