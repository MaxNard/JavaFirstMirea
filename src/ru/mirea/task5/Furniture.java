package ru.mirea.task5;

public class Furniture {
    private String material;
    private int cost;
    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial (String material){
        this.material=material;
    }

    public String toString(){
        return "Создан неизвестный вид мебели, материал: "+getMaterial()+", цена: "+getCost();
    }
}
