package com.huseyinbozdemir.androidprojem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin.")
        println(5*10)

        var a = 5
        var b = 10
        println(a*b)

        var yas = 50
        println(yas/5*8)
        yas = 60
        println(yas/5*8)

        val pi = 3.14
        val x = 5
        println(a*pi)

        val yasSonucu = yas * x
        println(yasSonucu)

        println("------------Int---------")
        var s1 = 5
        var s2 = 10
        println(s1+s2)

        var yeniInteger : Int = 30
        println(s1/2)
    }
}