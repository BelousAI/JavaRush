package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    private static int numberDirectories = -1;
    private static int numberFiles = 0;
    private static long totalSize = 0;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        numberFiles++;
        totalSize += Files.size(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        numberDirectories++;
        return FileVisitResult.CONTINUE;
    }

    public static int getNumberDirectories() {
        return numberDirectories;
    }

    public static int getNumberFiles() {
        return numberFiles;
    }

    public static long getTotalSize() {
        return totalSize;
    }
}
