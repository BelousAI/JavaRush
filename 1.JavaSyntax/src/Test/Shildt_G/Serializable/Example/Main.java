package Test.Shildt_G.Serializable.Example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        UserChild user = new UserChild();
        user.power = 150;
        user.sword = new Sword();
        UserChild newUser = null;

        try (FileOutputStream fileOutputStream = new FileOutputStream("User");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(user);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("User");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            newUser = (UserChild) objectInputStream.readObject();
            System.out.println(newUser.name);
            System.out.println(newUser.power);
            System.out.println(newUser.sword);
            System.out.println(UserChild.staticField);
            System.out.println(newUser.childLevel);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException eb) {
            System.out.println(eb.toString());
        } catch (ClassNotFoundException ef) {
            System.out.println("Class not found");
        }

    }
}
