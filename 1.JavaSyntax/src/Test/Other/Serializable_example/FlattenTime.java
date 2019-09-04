package Test.Other.Serializable_example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FlattenTime {
    public static void main(String[] args) {
        String fileName = "d://Test/time.ser";

        if (args.length > 0) {
            fileName = args[0];
        }

        PersistentTime time = new PersistentTime();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(time);
            oos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
