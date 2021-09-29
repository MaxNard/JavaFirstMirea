package ru.mirea.task2;

public class Shape {
    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Создана фигура, её цвет: "+getColor();
    }


}
