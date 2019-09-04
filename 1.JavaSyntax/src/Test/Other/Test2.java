package Test.Other;

import java.util.Formatter;

public class Test2 {
    public static void main(String[] args) {
        double x = 10000.00 / 3;

        System.out.println("Без форматирования x=" + x);
        System.out.println(String.format("С использованием форматирования x=%.2f", x));
        System.out.println(String.format("С использованием форматирования x=%8.2f", x));
        System.out.println(String.format("С использованием форматирования x=%9.2f", x));

        String name = "Anton";
        int age = 29;
        System.out.printf("%s, в следующем году вам будет %d лет \n", name, age);

        System.out.printf("String is a %5s \n", "nice");
        System.out.printf("String is a %15s \n", "nice");

        System.out.printf("String %,(.2f \n", -55535.536);
        System.out.printf("String %-10d \n", 5350);
        System.out.printf("String %-10d \n", 10000);
        System.out.printf("String %-10d \n", 10000000);
        System.out.printf("String %-10d \n", 1000000000);

        String s = "0501234567";
        System.out.printf("(%s)%s-%s-%s", s.substring(0, 3), s.substring(3, 6), s.substring(6, 8), s.substring(8));
    }
}
