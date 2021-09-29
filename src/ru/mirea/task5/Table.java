package ru.mirea.task5;

public class Table extends Furniture {
    private int area;

    public int getArea(){return area;}

    public void setArea(int area){this.area=area;}

    public String toString(){
        return getMaterial() + " стол площадью " + getArea() + ", цена: " + getCost();
    }
}
