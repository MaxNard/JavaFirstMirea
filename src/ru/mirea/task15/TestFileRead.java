package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;


class TestFileRead {
    public static void main(String[] args) throws Exception {
        //2. Реализовать вывод информации из файла на экран.
        try(FileReader reader = new FileReader("C:\\123.txt"))
        {

            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
