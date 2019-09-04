package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormatDemo7 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
