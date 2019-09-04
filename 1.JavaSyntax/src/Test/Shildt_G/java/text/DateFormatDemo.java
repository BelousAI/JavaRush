package Test.Shildt_G.java.text;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
        System.out.println("Япония: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
        System.out.println("Корея: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        System.out.println("США: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("По умолчанию: " + df.format(date));
    }
}
