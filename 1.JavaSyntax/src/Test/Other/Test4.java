package Test.Other;
import java.io.*;
/**
 * Created by Антон on 07.05.2017.
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        String str = "+38(050)123-45-67";
        str = "callto://" + str.replaceAll("[^+0-9]", "");
        System.out.println(str);

        String s = "Ivanov, Ivan";
        String[] arr = s.split(",");
        System.out.println(arr[1].trim());
    }
}
