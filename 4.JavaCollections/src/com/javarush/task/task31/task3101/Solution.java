package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        File root = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File resultRenamed = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, resultRenamed);

        List<File> list = new ArrayList<>();

        FileUtils.searchFiles(root, list);

        list.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(resultRenamed, true))) {
            FileUtils.copyFiles(list, out);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
