package ru.mirea.task1.opt3;
import java.util.Scanner;

public class Factorial {
    public static int Calcul(int num)
    {
        int n=1;
        if (n<0)
        {
            System.out.print("Число отрицательное!");
            System.exit(1);
        }
        else
        {
            for(int i=1;i<num+1;i++)
            {
                n*=(i);
            }

        }
        return n;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int i=sc.nextInt();
        Factorial obj=new Factorial();
        System.out.print(obj.Calcul(i));

    }
}
