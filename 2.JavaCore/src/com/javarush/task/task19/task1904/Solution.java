package com.javarush.task.task19.task1904;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner sc) {
            this.fileScanner = sc;
        }

        public Person read() throws IOException {
            String str = null;
            if (fileScanner.hasNext()) str = fileScanner.next();
            String[] arr = str.split(" ",4);
            Person p = null;
            try {
                p = new Person(arr[0], arr[1], arr[2], new SimpleDateFormat("dd MM yyyy").parse(arr[3]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return p;
        }

        public void close() throws IOException {
            fileScanner.close();
        }

    }
}
