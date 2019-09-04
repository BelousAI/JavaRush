package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))) {

            firstFileName = reader.readLine();
            secondFileName = reader1.readLine();
        }
        catch (IOException e) {}
    }//add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();//add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer(list.size());

        public void run() {
            BufferedReader rl = null;
            try {
                rl = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

                while (rl.ready()) {
                    list.add(rl.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if (rl != null) rl.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            for (String str : list) {
                sb.append(str + " ");
            }
            return sb.toString();
        }
    }//add your code here - добавьте код тут
}
