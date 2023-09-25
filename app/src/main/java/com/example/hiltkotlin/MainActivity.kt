package com.example.hiltkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car:Cars
    @Inject
    lateinit var myClassExample: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val band=Band()
//        val marka=Marka()
//        var bmw=Cars(band,marka)
//        bmw.sign()
        car.sign()
       println( myClassExample.MyFunctrion1())
        println(myClassExample.SecondFunction())
    }


}
@AndroidEntryPoint
class Fragment(): androidx.fragment.app.Fragment(){
    @Inject
    lateinit var car:Cars

}