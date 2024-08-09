package com.example.module_privides_binding_compose.Modules

import com.example.module_privides_binding_compose.FirebaseRepository
import com.example.module_privides_binding_compose.SQLrepository
import com.example.module_privides_binding_compose.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Provides
    fun getSQLrepository(sqLrepository: SQLrepository):UserRepository{
        return sqLrepository
    }
}