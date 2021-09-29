package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
        System.out.println("В магазине есть: ");
        int chairD=15, chairM=10, tableD=5, tableM=0;
        Chair chD = new Chair();
        Chair chM = new Chair();
        Table tbD = new Table();
        Table tbM = new Table();

        chD.setCost(1200);
        chM.setCost(1500);
        tbD.setCost(5000);
        tbM.setCost(6000);

        chD.setHeight(30);
        chM.setHeight(40);
        tbD.setArea(10000);
        tbM.setArea(12000);

        chD.setMaterial("деревянный");
        chM.setMaterial("металлический");
        tbD.setMaterial("деревянный");
        tbM.setMaterial("металлический");

        if (chairD>0) System.out.println(chD+", количество: "+chairD);
        if (chairM>0) System.out.println(chM+", количество: "+chairM);
        if (tableD>0) System.out.println(tbD+", количество: "+tableD);
        if (tableM>0) System.out.println(tbM+", количество: "+tableM);
    }
}
