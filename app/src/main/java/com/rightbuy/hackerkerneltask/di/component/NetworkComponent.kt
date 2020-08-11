package com.example.task_diagnal_technologies.di.component

import android.content.Context
import com.rightbuy.hackerkerneltask.di.module.DataModule
import com.rightbuy.hackerkerneltask.network.utils.DataHelper
import dagger.BindsInstance
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
interface NetworkComponent {

    fun inject(dataHelper: DataHelper)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance @Named("name") name: String, @BindsInstance @Named("appContext") context: Context): NetworkComponent
    }
}