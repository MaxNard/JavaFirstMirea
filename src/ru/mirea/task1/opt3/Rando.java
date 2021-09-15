package ru.mirea.task1.opt3;
import java.lang.*;
import java.util.*;
public class Rando {
    public static void main(String[] args)
    {
        Random random = new Random();
        int buf;
        int[] mass=new int[10];
        for(int i=0;i<10;i++)
        {
            mass[i++]=(int)(Math.random()*100);//Использование Math
            mass[i]=random.nextInt(100);//Использование Random
        }

        for (int i=0;i<10;i++)
        {
            System.out.print(mass[i]+" ");
        }
        System.out.print("\n");

        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                if (mass[i]<mass[j])
                {
                    buf=mass[i];
                    mass[i]=mass[j];
                    mass[j]=buf;
                }
            }
        }
        for (int i=0;i<10;i++)
        {
            System.out.print(mass[i]+" ");
        }
    }
}
