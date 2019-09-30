package com.javarush.task.task31.task3101;

import java.io.*;
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

        ArrayList<File> result;
        result=vozvratFile(root);

        try(FileOutputStream fileOutputStream=new FileOutputStream(resultRenamed))
        {
            for (File file:result)
            {
                try(FileInputStream inputStream=new FileInputStream(file))
                {
                    while(inputStream.available()>0)
                    {
                        fileOutputStream.write(inputStream.read());
                    }
                    byte[]bytes=System.lineSeparator().getBytes();
                    fileOutputStream.write(bytes);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        List<File> list = new ArrayList<>();
//
//        FileUtils.searchFiles(root, list);
//
//        list.sort(new Comparator<File>() {
//            @Override
//            public int compare(File o1, File o2) {
//                return (o1.getName().compareTo(o2.getName()));
//            }
//        });
//
//        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(resultRenamed, true))) {
//            FileUtils.copyFiles(list, out);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static ArrayList<File> vozvratFile(File path)
    {
        ArrayList<File>result=new ArrayList<>();
        for (File file:path.listFiles())
        {
            if (file.isFile()&&file.length()<=50)
            {
                result.add(file);
            }
            if (file.isDirectory())
            {
                ArrayList<File>result1=vozvratFile(file);
                result.addAll(result1);
            }
        }
        return result;
    }
}
