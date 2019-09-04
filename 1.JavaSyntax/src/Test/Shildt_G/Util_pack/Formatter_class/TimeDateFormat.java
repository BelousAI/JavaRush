package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        //вывести время в стандартном 12-часовом формате
        fmt.format("%tr", cal);
        System.out.println(fmt);

        //вывести только часы и минуты
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);

        //вывести название и номер месяца
        fmt = new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);

        //тест
        fmt = new Formatter();
        fmt.format("%tZ", cal);
        System.out.println(fmt);



        fmt.close();
    }
}
