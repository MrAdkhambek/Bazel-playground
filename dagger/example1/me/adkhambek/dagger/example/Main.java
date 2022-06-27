package me.adkhambek.dagger.example;

public class Main {

    public static void main(String[] args) {
        AppComponent appComponent = DaggerAppComponent.create();
        System.out.println(appComponent.getAppName());
    }
}
