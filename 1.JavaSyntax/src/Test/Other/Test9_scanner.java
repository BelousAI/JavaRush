package Test.Other;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Антон on 17.05.2017.
 */
public class Test9_scanner {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new FileInputStream("d://Test/example2.txt"));
        if (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date d = sdf.parse("31 12 1950");

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(d);
        String str = sdf2.format(d);
        System.out.println(str);

    }
}
