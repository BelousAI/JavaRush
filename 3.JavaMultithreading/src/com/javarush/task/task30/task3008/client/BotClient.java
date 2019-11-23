package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BotClient extends Client {

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (!message.contains(":")) return;

            String[] array = message.split(": ");
            String userName = array[0];
            String text = array[1];
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            String formatted = String.format("Информация для %s: ", userName);

            if (text.equals("дата")) {
                simpleDateFormat.applyPattern("d.MM.YYYY");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("день")) {
                simpleDateFormat.applyPattern("d");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("месяц")) {
                simpleDateFormat.applyPattern("MMMM");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("год")) {
                simpleDateFormat.applyPattern("YYYY");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("время")) {
                simpleDateFormat.applyPattern("H:mm:ss");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("час")) {
                simpleDateFormat.applyPattern("H");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("минуты")) {
                simpleDateFormat.applyPattern("m");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
            if (text.equals("секунды")) {
                simpleDateFormat.applyPattern("s");
                sendTextMessage(formatted + simpleDateFormat.format(date));
            }
        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return String.format("date_bot_%d", (int) (Math.random() * 100));
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }
}
