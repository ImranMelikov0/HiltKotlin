package com.example.hiltkotlin

import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Cars
@Inject
    constructor(band: Band,marka: Marka) {
    fun sign(){
        println("working")
    }
}