package com.example.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getFireBaseRepository(sqlRepository: SqlRepository): UserRepository
}