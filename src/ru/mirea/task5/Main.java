package ru.mirea.task5;
public class Main {
  public static void main(String[] args) {
  
    Cup Cup1 = new Cup();
    Cup1.setVolume(500);
    System.out.print("The volume of the cup is "+Cup1.getVolume()+" ml"+"\n");

    Plate Plate1 = new Plate();
    Plate1.setStatus ("dirty");
    System.out.print("This plate is "+Plate1.getStatus()+"\n");
    Plate1.setRadius (5);
    System.out.print("Radius of plate = "+Plate1.getRadius()+" cm");

    Keon keon1=new Keon();
    keon1.setLength(60);
    System.out.print("\nA keon dog has a tail length "+keon1.getLength()+" cm!");

    Dalmatian dalm1=new Dalmatian();
    dalm1.setAge(5);
    dalm1.setSpots (80);

    System.out.print("\nThe Dalmatian dog is "+dalm1.getAge()+" years old and has "+dalm1.getSpots()+" spots");
    
  }
}