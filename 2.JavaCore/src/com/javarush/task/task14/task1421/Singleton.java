package com.javarush.task.task14.task1421;

/**
 * Created by Антон on 20.03.2017.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
