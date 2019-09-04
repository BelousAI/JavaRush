package Test.Other;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.03.2016.
 */
public class FormatterDemo {
    public static void main(String[] args) {

        Formatter f = new Formatter();
        f.format("This %s%s %n%S", "YouTube-", "chanel", "helps study Java");
        System.out.println(f + "\n-----------");

        f = new Formatter();
        f.format("Hex: %x, Octal: %o,%nHex: %1$#x, Octal: %2$#o", 100021, 100021);
        System.out.println(f + "\n-----------");

        Calendar calendar = Calendar.getInstance();
        f = new Formatter();
        f.format(Locale.ENGLISH, "12ч формат: %1$tr, %nчас(24)/мин: %1$tH:%1$tM, " +
                "%nмесяц: %1$tB %1$tb %1$tm", calendar);
        System.out.println(f + "\n-----------");


    }
}
