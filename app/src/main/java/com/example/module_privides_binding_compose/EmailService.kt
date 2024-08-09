package com.example.module_privides_binding_compose

import android.util.Log
import javax.inject.Inject


interface NotificationService{
    fun send (to:String,from:String,body:String)
}

class EmailService @Inject constructor():NotificationService{

    override fun send (to:String,from:String,body:String){
        Log.d("tagdaggerhilt", "email sent")
    }
}

class MessageService():NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("tagdaggerhilt", "message sent")
    }

}