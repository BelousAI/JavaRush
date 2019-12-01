package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        Path directory = Paths.get(path);
        if (Files.isRegularFile(directory)) {
            System.out.println(directory.toString() + " - не папка");
            //System.exit(0);
        }

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(directory, visitor);
        System.out.println("Всего папок - " + MyFileVisitor.getNumberDirectories());
        System.out.println("Всего файлов - " + MyFileVisitor.getNumberFiles());
        System.out.println("Общий размер - " + MyFileVisitor.getTotalSize());
    }
}
