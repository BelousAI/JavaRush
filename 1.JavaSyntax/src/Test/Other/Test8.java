package Test.Other;

import Test.Shildt_G.String.IndexOfDemo;

/**
 * Created by Антон on 16.05.2017.
 */
public class Test8 {
    public static void main(String[] args) {
        Double d1 = new Double(1/0.);
        Double d2 = new Double(0/0.);

        System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
        System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());

        int a = Integer.bitCount(257);
        System.out.println(a);
        System.out.println(Integer.toString(10, 2));
        System.out.println(Integer.toBinaryString(10));

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.codePointAt("Anton", 4));
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        Runtime.getRuntime().gc();
    }
}
