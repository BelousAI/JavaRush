package Test.Other.Serializable_example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

public class InflateTime {
    public static void main(String[] args) {
        String fileName = "d://Test/time.ser";

        if (args.length > 0) {
            fileName = args[0];
        }

        PersistentTime time = null;
        FileInputStream fis = null;
        ObjectInputStream oin = null;

        try {
            fis = new FileInputStream(fileName);
            oin = new ObjectInputStream(fis);
            time = (PersistentTime) oin.readObject();
            oin.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //Распечатать восстановленное время
        System.out.println("Время разложения: " + time.getTime());
        System.out.println("Текущее время: " + Calendar.getInstance().getTime());
    }
}
