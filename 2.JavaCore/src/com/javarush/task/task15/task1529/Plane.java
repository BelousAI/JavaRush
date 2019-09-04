package com.javarush.task.task15.task1529;

/**
 * Created by Антон on 06.03.2017.
 */
public class Plane implements Flyable {
    private int numberOfPassengers;

    @Override
    public void fly() {

    }
    public Plane(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
