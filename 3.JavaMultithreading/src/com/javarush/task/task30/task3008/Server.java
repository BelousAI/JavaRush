package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            try (ServerSocket server = new ServerSocket(ConsoleHelper.readInt())) {
                System.out.println("Сервер успешно запущен");

                while (true) {
                    Socket clientSocket = server.accept();
                    Handler handler = new Handler(clientSocket);
                    handler.start();
                }
            }
        } catch (Exception e) {
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
