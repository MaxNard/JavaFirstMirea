package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;


class TestFileWrite {
    public static void main(String[] args) throws Exception {
        FileWriter writer1 = new FileWriter("C:\\123.txt");

        //1. Реализовать запись в файл введённой с клавиатуры информации.
        Scanner scan = new Scanner(System.in);
        writer1.write(scan.next());
        writer1.close();
    }
}
