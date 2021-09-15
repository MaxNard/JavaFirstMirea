package ru.mirea.task1.opt3;
import java.lang.*;
public class Harmon {
    public static void main(String[] args)
    {
        double n=1;
        for (int j=1;j<12;j++)
        {
            System.out.print((double)Math.round(n/j*100d)/100d+" ");
        }
    }
}
