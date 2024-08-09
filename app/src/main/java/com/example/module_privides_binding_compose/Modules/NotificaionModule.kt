package com.example.module_privides_binding_compose.Modules

import com.example.module_privides_binding_compose.MessageService
import com.example.module_privides_binding_compose.NotificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
class NotificaionServiceModule {

    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }
}