package com.javarush.task.task15.task1522;

/**
 * Created by Антон on 20.03.2017.
 */
public class Sun implements Planet {
    private static Sun instance = null;

    private Sun() {}

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
