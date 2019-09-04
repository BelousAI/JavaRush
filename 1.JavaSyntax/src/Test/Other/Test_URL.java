package Test.Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Антон on 02.07.2017.
 */
public class Test_URL {
    public static void main(String[] args) throws Exception {
        URL aURL = new URL("http://sibset.ru");


        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(aURL.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
