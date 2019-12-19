package com.javarush.task.task22.task2213;

/**
 * Этот класс будет описывать падающую фигурку.
 */
public class Figure {
    private int x;
    private int y;
    private int[][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    void left() {}

    void right() {}

    void down() {}

    void up() {}

    void rotate() {}

    void downMaximum() {}

    //проверка - может ли фигурка быть помещена в текущую позицию
    boolean isCurrentPositionAvailable() {
        return true;
    }

    //вызывается, когда фигурка достигла дна или уперлась в другую фигурку
    void landed() {}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
