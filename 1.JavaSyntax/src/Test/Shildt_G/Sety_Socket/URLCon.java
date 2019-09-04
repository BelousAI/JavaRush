package Test.Shildt_G.Sety_Socket;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLCon {
    public static void main(String[] args) {
        int c;
        try {
            URL hp = new URL("http://wooordhunt.ru");
            URLConnection hpCon = hp.openConnection();

            //получить дату
            long d = hpCon.getDate();
            if (d == 0) {
                System.out.println("Сведения о дате отсутствуют.");
            } else {
                System.out.println("Дата: " + new Date(d));
            }

            //Получить тип содержимого
            System.out.println("Тип содержимого: " + hpCon.getContentType());

            //Получить дату срока действия ресурса
            d = hpCon.getExpiration();
            if (d == 0) {
                System.out.println("Сведения о сроки действия отсутствуют.");
            } else {
                System.out.println("Срок действия истекает: " + new Date(d));
            }

            //Получить дату последней модификации
            d = hpCon.getLastModified();
            if (d == 0) {
                System.out.println("Сведения о дате последней модификации отсутствуют.");
            } else {
                System.out.println("Дата последней модификации: " + new Date(d));
            }

            //Получить длину содержимого
            long len = hpCon.getContentLengthLong();
            if (len == -1) {
                System.out.println("Длина содержимого не доступна.");
            } else {
                System.out.println("Длина содержимого: " + len);
            }

            if (len != 0) {
                System.out.println("=== Содержимое ===");
                InputStream in = hpCon.getInputStream();


                ByteArrayOutputStream out = new ByteArrayOutputStream();
                while ((c = in.read()) != -1) {
                    out.write(c);
                }

                String str = out.toString("UTF-8");
                System.out.println(str);



//                while ((c = in.read()) != -1) {
//                    System.out.print((char) c);
//                }
                in.close();
            } else {
                System.out.println("Содержимое недоступно.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
