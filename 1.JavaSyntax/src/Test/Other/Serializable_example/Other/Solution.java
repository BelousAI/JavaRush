package Test.Other.Serializable_example.Other;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        File file = new File("d://Test/MyFile2.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {
            Solution saveObject = new Solution(4);
            oos.writeObject(saveObject);
            Thread.sleep(1000);

            Solution sol = new Solution(6);

            Solution loadObject = (Solution) ois.readObject();
            System.out.println(saveObject.toString());
            System.out.println(loadObject.toString());
            System.out.println(sol.toString());
        }
        catch (ClassNotFoundException et) {
            System.out.println("Exception: " + et);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    transient private final String pattern = "dd MMMM yyyy HH:mm:ss:ms, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}