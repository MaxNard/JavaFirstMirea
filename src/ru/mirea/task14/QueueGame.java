import java.util.Scanner;
import java.util.Queue;
import java.util.*;
//add-закинуть remove-взять
class QueueGame {
  public static void main(String[] args) {
    Queue<Integer> firstQ = new ArrayDeque<Integer>();
    Queue<Integer> secondQ = new ArrayDeque<Integer>();

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
      int first = firstQ.remove();
      int second = secondQ.remove();
      switch (first)
      {
        case 9:
        {
          if (second==0)
          {
            secondQ.add(first);
            secondQ.add(second);
          }
          else
          {
            firstQ.add(first);
            firstQ.add(second);
          }
          break;
        }
        case 0:
        {
          if (second==9)
          {
            firstQ.add(first);
            firstQ.add(second);            
          }
          else
          {
            secondQ.add(first);
            secondQ.add(second);
          }
          break;
        }
        default:
        {
          if (first>second)
          {
            firstQ.add(first);
            firstQ.add(second);              
          }
          else
          {
            secondQ.add(first);
            secondQ.add(second);
          }
          break;          
        }
      }
      botva++;
    }
  }
}
