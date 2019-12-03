package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.WrongZipFileException;
import java.io.IOException;

public class Archiver {
    public static Operation askOperation() throws IOException {
        StringBuilder builder = new StringBuilder("Выберите операцию:\n");
        builder.append(Operation.CREATE.ordinal()).append(" - упаковать файлы в архив\n")
                .append(Operation.ADD.ordinal()).append(" - добавить файл в архив\n")
                .append(Operation.REMOVE.ordinal()).append(" - удалить файл из архива\n")
                .append(Operation.EXTRACT.ordinal()).append(" - распаковать архив\n")
                .append(Operation.CONTENT.ordinal()).append(" - просмотреть содержимое архива\n")
                .append(Operation.EXIT.ordinal()).append(" - выход\n");

        ConsoleHelper.writeMessage(builder.toString());
        int index = ConsoleHelper.readInt();
        return Operation.values()[index];
    }

    public static void main(String[] args) {
        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        } while (operation != Operation.EXIT);
    }
}
