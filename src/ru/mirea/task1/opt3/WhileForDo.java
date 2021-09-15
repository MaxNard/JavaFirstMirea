package ru.mirea.task1.opt3;
import java.util.Scanner;

public class WhileForDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];

        int i = 0;
        while (i < n) {
            b[i++] = sc.nextInt();
        }
        i = 0;

        int sum2 = 0;
        do {
            sum2+=b[i++];
        }
        while (i < n);

        int sum1=0;
        for (int j=0;j<n;j++)
        {
            sum1+=b[j];
        }

        System.out.print(sum1 + " "+ sum2);
    }
}
