import java.util.ArrayList;

class Main {
  public static void allOut(ArrayList<String> list)
  {
    for(int i = 0; i < list.size(); i++)
    {
      System.out.print(list.get(i)+" "); 
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<String>(3);
    ArrayList<String> list2 = new ArrayList<String>();
    //Обычное добавление в конец
    list1.add("Михаил");
    list1.add("Никита");
    list1.add("Денис");
    allOut(list1);
    //Добавление в середину
    list1.add(1,"Сергей");
    allOut(list1);
    //Добавление в середину первой коллекции другую коллекцию
    list2.add("Филипп");
    list2.add("Сергей");
    list1.addAll(2,list2);
    allOut(list1);

    //Удаление по значению
    list1.addAll(list1);
    for(int i = 0; i < list1.size(); i++)
    {
    list1.remove("Сергей");
    }
    allOut(list1);

    //Удаление индексов
    list1.remove(5);
    allOut(list1);
  }
}