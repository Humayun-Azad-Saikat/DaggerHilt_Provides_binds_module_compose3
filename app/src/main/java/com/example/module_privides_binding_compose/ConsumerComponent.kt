package com.example.module_privides_binding_compose


import com.example.module_privides_binding_compose.Modules.NotificaionServiceModule
import com.example.module_privides_binding_compose.Modules.UserRepoModule_Binds
import com.example.module_privides_binding_compose.Modules.UserRepositoryModule
import dagger.Component

//@Component(modules = [UserRepositoryModule::class, NotificaionServiceModule::class])
@Component(modules = [UserRepoModule_Binds::class, NotificaionServiceModule::class])
interface ConsumerComponent {

    fun injectMainAC(mainActivity: MainActivity)
}