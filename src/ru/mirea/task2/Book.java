package ru.mirea.task2;

public class Book {
    private String name;
    private int pageNumber;

    public Book(String n, int a) {
        name = n;
        pageNumber = a;
    }

    public Book(String n) {
        name = n;
        pageNumber=200;
    }

    public Book() {
        name = "Harry Potter";
        pageNumber = 100;
    }

    public void setNumberOfPages(int pagesNumber) {
        this.pageNumber = pagesNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String toString() {
        return this.name + ", pages = " + this.pageNumber;
    }
}

