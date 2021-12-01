import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;
//addFirst-закинуть remove-взять
class Main {
  public static void main(String[] args) {
    LinkedList<Integer> firstQ = new LinkedList<Integer>();
    LinkedList<Integer> secondQ = new LinkedList<Integer>();

    Scanner scan = new Scanner (System.in);
    System.out.println("Введите колоду первого игрока: ");
    for(int i = 0; i < 5 ; i++)
    {
      firstQ.add(scan.nextInt());
    }
    System.out.println("Введите колоду второго игрока: ");
    for(int i = 0; i < 5 ; i++)
    {
      secondQ.add(scan.nextInt());
    }
    int botva = 0;
    while (true){
      //Условие победы
      if(firstQ.isEmpty())
      {
        System.out.println("Победил второй за "+botva+" шагов.");
        break;
      }
      if(secondQ.isEmpty())
      {
        System.out.println("Победил первый за "+botva+" шагов.");
        break;
      }
      if (botva == 106)
      {
        System.out.println("Ботва!");
      }
      //Процесс игры.
      int first = firstQ.removeLast();
      int second = secondQ.removeLast();
      switch (first)
      {
        case 9:
        {
          if (second==0)
          {
            secondQ.addFirst(first);
            secondQ.addFirst(second);
          }
          else
          {
            firstQ.addFirst(first);
            firstQ.addFirst(second);
          }
          break;
        }
        case 0:
        {
          if (second==9)
          {
            firstQ.addFirst(first);
            firstQ.addFirst(second);            
          }
          else
          {
            secondQ.addFirst(first);
            secondQ.addFirst(second);
          }
          break;
        }
        default:
        {
          if (first>second)
          {
            firstQ.addFirst(first);
            firstQ.addFirst(second);              
          }
          else
          {
            secondQ.addFirst(first);
            secondQ.addFirst(second);
          }
          break;          
        }
      }
      botva++;
    }
  }
}