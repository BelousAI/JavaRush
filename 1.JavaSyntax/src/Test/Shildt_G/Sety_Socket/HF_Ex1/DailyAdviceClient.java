package Test.Shildt_G.Sety_Socket.HF_Ex1;

import java.io.IOException;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DailyAdviceClient {
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 5000);

            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String text = reader.readLine();
            reader.close();
            System.out.println("Сегодня ты должен: " + text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
