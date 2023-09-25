package com.example.hiltkotlin

import javax.inject.Inject

class InterfaceImplementers
    @Inject constructor():MyInterface{
    override fun myFunction(): String {
        return "My Interface Implementor"
    }
}