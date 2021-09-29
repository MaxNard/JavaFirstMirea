package ru.mirea.task7;

public class Square extends Rectangle{
  public Square(){};
  public Square (double side){
    length = side;
  }
  public Square (double side, String color,boolean filled){
    length = side;
    this.color = color;
    this.filled = filled;
  }

  public double getSide(){
    return length;
  }

  public void setSide(double side){
    length = side;
  }

  public void setWidth (double side) {
    this.width=side;
  }

  public void setLength (double side) {
    this.length=side;
  }

  public String toString(){
    return getColor()+" квадрат со сторонами: "+getSide()+". Длина периметра: "+getSide()*4+". Площадь: "+Math.pow(getSide(),2);
  }
}