package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Angels&Demons");
        Book b3 = new Book("Playing God",239);
        b3.setNumberOfPages(70);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
