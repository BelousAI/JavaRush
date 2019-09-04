package com.javarush.task.task15.task1522;


/**
 * Created by Антон on 20.03.2017.
 */
public class Earth implements Planet {
    private static Earth instance = null;

    private Earth() {}

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
