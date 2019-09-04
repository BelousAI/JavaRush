package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream object;

    public AmigoOutputStream(FileOutputStream object) throws FileNotFoundException {
        super(fileName);
        this.object = object;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        object.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        object.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        object.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        object.flush();
    }

    @Override
    public void close() throws IOException {
        object.flush();
        String text = "JavaRush © All rights reserved.";
        object.write(text.getBytes());
        object.close();
    }
}
