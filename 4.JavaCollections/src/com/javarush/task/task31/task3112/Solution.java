package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.*;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("C:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();

        Path temp = Files.createTempFile("temp-", ".tmp");
        Files.copy(inputStream, temp);

        //String target = urlString.substring(urlString.lastIndexOf("/"));
        String[] tokens = urlString.split("/");
        String target = downloadDirectory.toString() + "/" + tokens[tokens.length - 1];
        Path result = Paths.get(target);

        Files.move(temp, result);

        return result;
    }
}
