package com.example.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject constructor(
    @FirstImplementor private val myInterfaceImplementers: MyInterface
,private val gson: Gson,
@SecondImplementor private val mySecondInterfaceImplementor:MyInterface){
    fun MyFunctrion1():String{
        return "Working: ${myInterfaceImplementers.myFunction()}"
    }
    fun SecondFunction():String{
        return "Second ${mySecondInterfaceImplementor.myFunction()}"
    }
}