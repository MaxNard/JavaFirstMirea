package ru.mirea.task10;
public class Decomposition7 {
  static void decomposition (int n, int i ){
    if (n/2<i){
      System.out.print(n);
      return;
    }
    if (n%i==0){
      System.out.print(i+", ");
      decomposition (n/i,i);
      }
    else{
      i++;
      decomposition(n,i);
    }
  }

  public static void main(String[] args) {
    decomposition(36, 2);
  }
}