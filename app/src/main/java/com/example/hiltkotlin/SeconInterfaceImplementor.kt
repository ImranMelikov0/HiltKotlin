package com.example.hiltkotlin

import javax.inject.Inject

class SeconInterfaceImplementor
    @Inject
    constructor():MyInterface{
    override fun myFunction(): String {
        return "MyInterfaceSecondImplementor"
    }
}