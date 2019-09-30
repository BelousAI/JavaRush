package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        ArrayList<String> allFiles = new ArrayList<>();
        Queue<File> dirs = new LinkedList<>();
        dirs.add(new File(root));

        while (!dirs.isEmpty()) {
            for (File file : dirs.poll().listFiles()) {
                if (file.isDirectory()) {
                    dirs.add(file);
                } else if (file.isFile()) allFiles.add(file.getAbsolutePath());
            }
        }
        return allFiles;
    }

    public static void main(String[] args) {
        
    }
}
