package com.mycompany.practical3;
import java.io.File;

public class ListFiles {

    public void Exam(String directoryPath ){
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            listFilesAndDirectories(directory);
        } else {
            System.out.println("Указанный путь не является директорией или не существует.");
        }
    }

    public static void listFilesAndDirectories(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Каталог: " + file.getName());
                    listFilesAndDirectories(file); 
                } else {
                    System.out.println("Файл: " + file.getName() + " (" + file.length() + " байт)");
                }
            }
        }
    }
}