package com.newwalk.khoroshilova_retrofit


    data class Base(val Valute: Valute?)

    data class Valute(val CharCode: String?,
                      val Value: String?,
                      val ID: String?,
                      val Nominal: String?,
                      val NumCode: String?,
                      val Name: String?)
