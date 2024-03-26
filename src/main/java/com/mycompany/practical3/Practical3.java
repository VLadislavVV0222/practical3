/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3;

/**
 *
 * @author vladc
 */
import java.util.*;
public class Practical3{
    public static void main(String[] args) {
        System.out.println("Вариант 5");
        System.out.println("ФИО: Чугунов Владислав Владимирович");
        ListFiles list = new ListFiles();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the directory: C:"+"\\"+"\\");
        String path = "C:"+"\\"+"\\"+scanner.next();
        list.Exam(path);
    }
}
        
        