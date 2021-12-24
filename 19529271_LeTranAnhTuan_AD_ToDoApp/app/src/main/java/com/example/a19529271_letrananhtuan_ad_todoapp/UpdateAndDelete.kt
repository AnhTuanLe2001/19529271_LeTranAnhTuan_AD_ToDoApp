package com.example.a19529271_letrananhtuan_ad_todoapp

interface UpdateAndDelete{

    fun modifyItem(itemUID :String ,isDone :Boolean )
    fun onItemDelete(itemUID: String)
}