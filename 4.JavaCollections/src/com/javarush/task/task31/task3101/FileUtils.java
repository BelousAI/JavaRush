package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtils {

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }

    public static void renameFile(File source, File destination) {
        if (!source.renameTo(destination)) System.out.println("Can not rename file with name " + source.getName());
    }

    public static boolean isExist(File file) {
        return file.exists();
    }

    public static void searchFiles(File root, List<File> list) {
        for (File f : root.listFiles()) {
            if (f.isDirectory()) {
                searchFiles(f, list);
                continue;
            }
            if (f.length() > 50) {
                FileUtils.deleteFile(f);
            }
            else list.add(f);
        }
    }

    public static void copyFiles(List<File> list, OutputStream out) {
        for (File file : list) {
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
                byte[] buffer = new byte[50];
                int lengthRead;

                while ((lengthRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lengthRead);
                    out.flush();
                }

                out.write(System.lineSeparator().getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(file.getName());
        }
    }
}
