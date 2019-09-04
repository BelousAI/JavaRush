package Test.Shildt_G.Sety_Socket;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL hp = new URL("http://www.HerbSchildt.com/Articles");

            System.out.println("Протокол: " + hp.getProtocol());
            System.out.println("Порт: " + hp.getPort());

            System.out.println("Хост: " + hp.getHost());
            System.out.println("Файл: " + hp.getFile());
            System.out.println("Полная форма: " + hp.toExternalForm());
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
