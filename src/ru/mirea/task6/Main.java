class Main {
  public static void main(String[] args) {
    Car Car1 = new Car();
    Planet Planet1 = new Planet();
    Car1.setName("Lada");
    Planet1.setName("Earth");
    System.out.print("Car name: "+Car1.getName()+";\nPlanet name: "+Planet1.getName()+";\n");

    Umbrella umbrella1 = new Umbrella();
    Cake cake1=new Cake();
    cake1.setPrice(399);
    umbrella1.setPrice(999);
    System.out.print("Торт имеет цену: "+cake1.getPrice()+" рублей;\nЗонт имеет цену: "+umbrella1.getPrice()+" рублей;");

  }
}
