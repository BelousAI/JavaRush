package Test.Shildt_G.java.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo2 {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalTime cutTime = LocalTime.now();
        System.out.println(cutTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
    }
}
