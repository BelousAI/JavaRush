package Test.Shildt_G.Figure_extends;


import java.util.Date;
import java.io.*;

/**
 * Created by Антон on 05.04.2017.
 */
abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

    static void read() {
        System.out.println("Вызов статического метода из класса Figure");
    }

    final void method() {
        System.out.println("Вызов завершенного(final) метода из класса Figure.");
    }

    java.util.ArrayList<String> list = new java.util.ArrayList<>();
}
