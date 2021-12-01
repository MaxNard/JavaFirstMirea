import java.util.LinkedList;

class Main {
  public static void allOut(LinkedList<Integer> list)
  {
    for(int i = 0; i < list.size(); i++)
    {
      System.out.print(list.get(i)+" "); 
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>();

    for (int i = 0 ; i < 6 ; i++){
      list1.add(i+1);
    }
    allOut(list1);

    list1.add(3 , 5);
    list1.removeLast();
    allOut(list1);

    System.out.println(list1.contains(10));

    System.out.println(list1.poll());
    allOut(list1);

    System.out.println(list1.size());
  }
}
