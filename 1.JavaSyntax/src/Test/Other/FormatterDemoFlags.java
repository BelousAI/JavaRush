package Test.Other;

import java.util.Formatter;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.03.2016.
 */
public class FormatterDemoFlags {
    public static void main(String[] args) {

        Formatter f = new Formatter();
        f.format("| %12.2f |", 123.123);
        System.out.println(f + "\n-----------");

        f = new Formatter();
        f.format("| %012.2f |", 123.123);
        System.out.println(f + "\n-----------");

        f = new Formatter();
        f.format("| %-12.2f |", 123.123);
        System.out.println(f + "\n-----------");

        f = new Formatter();
        f.format("%(d", -1000);
        System.out.println(f + "\n-----------");

        f = new Formatter();
        f.format("%,.1f", 1023.123);
        System.out.println(f + "\n-----------");

        f = new Formatter();
        f.format("%7.5s", "Бум бурум бурурум....");
        System.out.println(f + "\n-----------");

    }
}
