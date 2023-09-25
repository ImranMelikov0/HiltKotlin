package com.example.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myFunction():String
}

//@InstallIn(ActivityComponent::class)
//@Module
//abstract class MyModule{
//    @ActivityScoped
//    @Binds
//    abstract fun bindingFunction(myImplementers: InterfaceImplementers):MyInterface
//}

@InstallIn(ActivityComponent::class)
@Module
class MyModule{
    @FirstImplementor
    @ActivityScoped
    @Provides
    fun providerFunction():MyInterface{
        return InterfaceImplementers()
    }
    @SecondImplementor
    @ActivityScoped
    @Provides
    fun secondFunction():MyInterface{
        return SeconInterfaceImplementor()
    }
    @ActivityScoped
    @Provides
    fun getgson():Gson{
        return Gson()
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor