package Test.Shildt_G.java.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeDemo4 {
    public static void main(String[] args) {
        //получить объект типа LocalDateTime, выполнив
        //синтаксический анализ символной строки даты и времени
        LocalDateTime ldt = LocalDateTime.parse("June 21, 2014 12:01 AM",
                DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a", Locale.US));

        //а теперь отобразить проанализированные дату и время
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a")));
    }
}
