package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = null;
            try {
                int port = ConsoleHelper.readInt();
                System.out.println("Сервер успешно запущен");
                server = new ServerSocket(port);

                while (true) {
                    Socket clientSocket = server.accept();
                    Server.Handler handler = new Server.Handler(clientSocket);
                }
            } finally {
                server.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler (Socket socket) {
            this.socket = socket;
        }
    }
}
