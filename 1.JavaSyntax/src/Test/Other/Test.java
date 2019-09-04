package Test.Other;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws Exception {
        String str = "29/01/1989";
        Date d = new Date(1989 - 1900, 0, 29);

        SimpleDateFormat formDateIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formDateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        Date ndate = formDateIn.parse(str);


        System.out.println(ndate);
        System.out.println(formDateOut.format(d));
    }
}