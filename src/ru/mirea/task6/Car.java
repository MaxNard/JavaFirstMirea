package ru.mirea.task6;
public class Car implements Nameable
{
  private String name;

  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }
}