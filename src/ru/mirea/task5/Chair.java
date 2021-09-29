package ru.mirea.task5;

public class Chair extends Furniture {
    private int height;

    public int getHeight(){
        return height;
    }

    public void setHeight (int height){
        this.height=height;
    }

    public String toString() {
        return getMaterial() + " cтул высотой " + getHeight() + ", цена: " + getCost();
    }
}
