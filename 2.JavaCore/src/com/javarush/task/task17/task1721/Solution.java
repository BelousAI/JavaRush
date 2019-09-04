package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;

        try {
            file1 = reader.readLine();
            file2 = reader.readLine();

            BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));

            while(br1.ready()) {
                allLines.add(br1.readLine());
            }

            while (br2.ready()) {
                forRemoveLines.add(br2.readLine());
            }

            br1.close();
            br2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Solution test = new Solution();

        try {
            test.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }


    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            for (String str : forRemoveLines) {
                if (allLines.contains(str)) {
                    allLines.remove(str);
                }
            }
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
