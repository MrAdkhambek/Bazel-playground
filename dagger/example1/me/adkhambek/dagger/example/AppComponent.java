package me.adkhambek.dagger.example;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {

    String getAppName();
}

