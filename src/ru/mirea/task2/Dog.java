package ru.mirea.task2;
import java.awt.datatransfer.ClipboardOwner;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog (String n, int a) {
        name = n;
        age = a;
    }

    public Dog (String n) {
        name = n;
    }

    public Dog () {
        name = "Yongo";
        age = 0;
    }

    public void setAge (int age) {
        this.age=age;
    }

    public void setName (String name){

    }

    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return this.name+", age "+this.age;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
