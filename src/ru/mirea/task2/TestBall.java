package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball("Green");
        Ball b3 = new Ball("Blue",5);
        b3.setRadius(6);
        System.out.println(b1);
        b1.getVolume();
        b2.getVolume();
        b3.getVolume();
    }
}
