package com.example.module_privides_binding_compose.Modules

import com.example.module_privides_binding_compose.SQLrepository
import com.example.module_privides_binding_compose.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
abstract class UserRepoModule_Binds {

    @Binds
    abstract fun getSQLrepository(sqLrepository: SQLrepository): UserRepository

    /*dagger can create SQLrepository classes object in userRepository class with @Inject annotation
    for this we didnt use @Provides. we used @Binds*/

}