package ru.mirea.task1.opt3;

public class Cmd {
    public static void main(String[] args) {
        if (args.length>0) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args);
            }
        }
        else System.out.print("Arguments not found");
    }
}
