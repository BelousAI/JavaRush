package Test.Other;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Антон on 09.05.2017.
 */
public class Test6 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[0]);){
            int count = 0;
            while (fis.available() > 0) {
                int data = fis.read();
                if ((data >= 'A') && (data <= 'Z')) count++;
                else if ((data >= 'a') && (data <= 'z')) count++;
            }
            System.out.println(count);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
