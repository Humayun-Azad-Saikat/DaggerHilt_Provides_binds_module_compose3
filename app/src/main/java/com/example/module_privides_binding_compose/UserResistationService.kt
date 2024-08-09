package com.example.module_privides_binding_compose

import javax.inject.Inject

class UserResistaionService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {

    fun resisterUser(email:String,password:String){
        userRepository.saveUser("saikat","codedash00@gmail.com")
        notificationService.send("saikat","system","email body")
    }
}