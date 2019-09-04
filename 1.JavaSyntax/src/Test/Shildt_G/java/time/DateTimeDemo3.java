package Test.Shildt_G.java.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeDemo3 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a", Locale.US)));
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
