package Test.Shildt_G.Sety_Socket.HF_Ex1;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;


public class DailyAdviceServer {
    private String[] adviceList = {"Ешьте меньшими порциями",
            "Купите облегающие джинсы. Нет, они не делают Вас полнее.",
            "Два слова: не годится", "Будьте честны хотя бы сегодня", "Сегодня стоит помыть авто"};

    private void go() {
        try {
            ServerSocket serverSock = new ServerSocket(5000);

            while (true) {
                Socket s = serverSock.accept();

                PrintWriter writer = new PrintWriter(s.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
