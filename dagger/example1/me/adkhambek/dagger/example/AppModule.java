package me.adkhambek.dagger.example;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;


@Module
public class AppModule {

    @Provides
    @Singleton
    public String provideAppName() {
        return "Application name";
    }
}
