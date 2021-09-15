package ru.mirea.task2;

public class Ball {
    private String color;
    private int radius;

    public Ball (String n, int a) {
        color = n;
        radius = a;
    }

    public Ball(String n) {
        color = n;
    }

    public Ball () {
        color = "Red";
        radius = 1;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color){

    }

    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }

    public String toString(){
        return this.color +" ball, radius "+this.radius;
    }

    public void getVolume(){
        double volume=4/3*3.14*radius*radius*radius;
        System.out.println(color +" ball have volume =  "+ volume);
    }
}
