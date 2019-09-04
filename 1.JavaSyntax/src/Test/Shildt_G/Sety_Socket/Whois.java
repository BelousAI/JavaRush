package Test.Shildt_G.Sety_Socket;

import java.io.*;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) {
        String response;
        try (Socket sock = new Socket("whois.internic.net", 43)) {

            //получить потоки ввода-вывода
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));

            //сформировать строку запроса
            String str = (args.length == 0 ? "nba.com" : args[0]) + "\n";

            //послать запрос
            out.write(str);
            out.flush(); //ОБЯЗАТЕЛЬНЫЙ!!

            //прочитать ответ и вывести его на экран
            while ((response = in.readLine()) != null) {
                System.out.println(response);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
