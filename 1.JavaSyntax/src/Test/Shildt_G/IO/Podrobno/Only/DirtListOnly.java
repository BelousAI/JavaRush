package Test.Shildt_G.IO.Podrobno.Only;

/**
 * Created by Антон on 12.06.2017.
 */
import java.io.*;

public class DirtListOnly {
    public static void main(String[] args) {
        String dirname = "d://";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String[] s = fl.list(only);

        for (String value : s) {
            System.out.println(value);
        }
    }
}
