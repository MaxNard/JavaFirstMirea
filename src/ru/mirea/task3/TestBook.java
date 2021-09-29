package ru.mirea.task3;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setAuthor("Tolstoy");
        b1.setYear(1852);
        b1.setName("Childhood");

        System.out.print("Книга: "+b1.getName()+", год написания: "+b1.getYear()+", автор: "+b1.getAuthor());
    }
}

