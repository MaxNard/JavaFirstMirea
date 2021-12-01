import java.util.Scanner;
import java.util.Stack;
//push-закинуть pop-взять
class StackGame {
  public static void main(String[] args) {
    Stack<Integer> firstReal = new Stack<Integer>();
    Stack<Integer> firstBuff = new Stack<Integer>();
    Stack<Integer> secondReal = new Stack<Integer>();
    Stack<Integer> secondBuff = new Stack<Integer>();

    Scanner scan = new Scanner (System.in);
    System.out.println("Введите колоду первого игрока: ");
    for(int i = 0; i < 5 ; i++)
    {
      firstReal.push(scan.nextInt());
    }
    System.out.println("Введите колоду второго игрока: ");
    for(int i = 0; i < 5 ; i++)
    {
      secondReal.push(scan.nextInt());
    }
    int botva = 0;
    while (true){
      //Условие победы
      if(firstReal.isEmpty()&&firstBuff.isEmpty())
      {
        System.out.println("Победил второй за "+botva+" шагов.");
        break;
      }
      if(secondReal.isEmpty()&&secondBuff.isEmpty())
      {
        System.out.println("Победил первый за "+botva+" шагов.");
        break;
      }
      if (botva == 106)
      {
        System.out.println("Ботва!");
      }
      //Заполнение основной колоды из дополнительной.
      if(firstReal.isEmpty())
      {
        while (!firstBuff.isEmpty())
        {
          firstReal.push(firstBuff.pop());
        }
      }
      if(secondReal.isEmpty())
      {
        while (!secondBuff.isEmpty())
        {
          secondReal.push(secondBuff.pop());
        }
      }
      //Процесс игры.
      int first = firstReal.pop();
      int second = secondReal.pop();
      switch (first)
      {
        case 9:
        {
          if (second==0)
          {
            secondBuff.push(first);
            secondBuff.push(second);
          }
          else
          {
            firstBuff.push(first);
            firstBuff.push(second);
          }
          break;
        }
        case 0:
        {
          if (second==9)
          {
            firstBuff.push(first);
            firstBuff.push(second);            
          }
          else
          {
            secondBuff.push(first);
            secondBuff.push(second);
          }
          break;
        }
        default:
        {
          if (first>second)
          {
            firstBuff.push(first);
            firstBuff.push(second);              
          }
          else
          {
            secondBuff.push(first);
            secondBuff.push(second);
          }
          break;          
        }
      }
      botva++;
    }
  }
}
