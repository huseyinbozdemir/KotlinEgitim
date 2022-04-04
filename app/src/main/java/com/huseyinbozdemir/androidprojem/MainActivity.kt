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

        println("------------Long---------")
        var yeniLong:Long = 100
        yeniLong = 300000000000
        println(yeniLong)

        println("------------Double & Float---------")
        var ondalikli = 3.14
        println(ondalikli*2)
        println(ondalikli/2)

        println("------------String---------")

        var yeniString = "Yeni metin"
        println(yeniString.length)

        var isim = "Hüseyin"
        var soyisim = "Bozdemir"
        var tamIsim = isim + " " + soyisim
        println(tamIsim)

        println("------------Boolean---------")
        var yeniBoolean=true
        yeniBoolean=false
        println(3<5)

        println("------------Dönüşüm---------")
        var dInt = 10
        var dLongToInt = dInt.toLong()
        println(dLongToInt)

        var kullaniciGirdisi="50"
        var kullaniciInt=kullaniciGirdisi.toInt()
        println(kullaniciInt*5)

        println("------------Dizi---------")
        var yeniDizi = arrayOf("Hüseyin","Bozdemir","Ali","Veli")

        println(yeniDizi[0])
        println(yeniDizi.get(1))

        yeniDizi.set(0,"Mahmut")
        println(yeniDizi[0])

        var numaraDizi = arrayOf(1,2,3,5)
        println(numaraDizi.get(2))

        var karisikDizi= arrayOf("Hüseyin",2,4,5,6,true)
        println(karisikDizi.get(5))

        println("------------Array List---------")
        var isimListesi = arrayListOf("Hüseyin","Yunus","Furkan")
        println(isimListesi.get(1))

        isimListesi.add("Batuhan")
        println(isimListesi.get(3))

        var karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Test")
        karisikArrayList.add(5)
        karisikArrayList.add(true)
        println(karisikArrayList.get(2))

        var intArrayList = ArrayList<Int>()
        intArrayList.add(4)
        intArrayList.add(2)
        println(intArrayList.get(1))

        println("------------Set---------")
        var ornekDizi = arrayOf(7,8,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")
        println(ornekDizi.size)

        val yeniSet = setOf<Int>(7,8,9,9,8,10)
        println(yeniSet.size)
        println("Set yazılıyor..")
        yeniSet.forEach{
            println(it)
        }

        var digerSet = HashSet<String>()
        digerSet.add("Hüseyin")
        digerSet.add("Hüseyin")
        digerSet.add("Bozdemir")
        digerSet.forEach{
            println(it)
        }
    }
}