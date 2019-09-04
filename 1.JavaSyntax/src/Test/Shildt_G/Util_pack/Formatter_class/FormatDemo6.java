package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.*;

public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("% d", -100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", -200);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 200);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%(d", -100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%,.2f", 4356783497.34);
        System.out.println(fmt);
        fmt.close();

        // # - выводит 0 для восьмеричн числа; 0х для 16-ного числа
        fmt = new Formatter();
        fmt.format("%#o", 309);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%X", 250);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%E", 123.1234);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%3$(d %1$d %2$d", 10, 20, -30);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("Число %d в шестнадцатеричном формате равно %1$x", 255);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("Число %d в шестнадцатеричном формате равно %<x", 255);
        System.out.println(fmt);
        fmt.close();
    }
}
