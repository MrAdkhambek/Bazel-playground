package me.adkhambek.example3;

import lombok.Data;


public class Main {

    @Data
    static class Holder {
        private final String title;
    }

    public static void main(String[] args) {
        Holder holder = new Holder("Title");
        System.out.println(holder.getTitle());
        System.out.println(holder.hashCode());
        System.out.println(holder.toString());
    }
}
