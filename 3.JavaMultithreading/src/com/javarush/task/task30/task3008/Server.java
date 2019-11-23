package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        try {
            try (ServerSocket server = new ServerSocket(ConsoleHelper.readInt())) {
                ConsoleHelper.writeMessage("Сервер успешно запущен");

                while (true) {
                    Socket clientSocket = server.accept();
                    Handler handler = new Handler(clientSocket);
                    handler.start();
                }
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage(e.getMessage());
        }

    }

    private static class Handler extends Thread {
        private Socket socket;

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединение с удаленным адресом " + socket.getRemoteSocketAddress());

            try (Connection connection = new Connection(socket)) {
                String userName = serverHandshake(connection);
                Message userAdded = new Message(MessageType.USER_ADDED, userName);
                sendBroadcastMessage(userAdded);
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);

                connectionMap.remove(userName);
                Message userRemoved = new Message(MessageType.USER_REMOVED, userName);
                sendBroadcastMessage(userRemoved);
                ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто.");
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Внимание! Произошла ошибка при обмене данными с удаленным адресом.");
            }
        }

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message nameRequest = new Message(MessageType.NAME_REQUEST);
            Message nameAccepted = new Message(MessageType.NAME_ACCEPTED);
            Message userName;
            String name;

            while (true) {
                connection.send(nameRequest);
                userName = connection.receive();
                name = userName.getData();

                if (userName.getType() == MessageType.USER_NAME
                        && !(name.equals(""))
                        && !(connectionMap.containsKey(name))) break;
            }
            connectionMap.put(name, connection);
            connection.send(nameAccepted);
            return name;
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!entry.getKey().equals(userName)) {
                    Message userAdd = new Message(MessageType.USER_ADDED, entry.getKey());
                    connection.send(userAdd);
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            Message message;

            while (true) {
                message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    Message text = new Message(MessageType.TEXT, userName + ": " + message.getData());
                    sendBroadcastMessage(text);
                } else  {
                    ConsoleHelper.writeMessage("Ошибка! Тип сообщения не соответствует - TEXT");
                }
            }
        }
    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                entry.getValue().send(message);
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Не удалось отправить сообщение.");
        }
    }
}
