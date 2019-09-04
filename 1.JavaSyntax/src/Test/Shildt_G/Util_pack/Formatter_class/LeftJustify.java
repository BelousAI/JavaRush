package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */

import java.util.Formatter;

public class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        //Выровнять по правому краю(по умолчанию)
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();

        //а теперь выровнять по левому краю
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.1230);
        System.out.println(fmt);
        fmt.close();
    }
}
