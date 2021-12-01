package ru.mirea.task12;

class FastSortTest {
  public static void main(String[] main)
  {
    //Создание объектов и инициализация оценок.
    Student[] stud = new Student[10];
    int[] points = {1 , 6 , 5, 8, 9, 2, 5, 10 , 3 , 4};
    for(int i = 0; i < stud.length; i++) {
      stud[i] = new Student(points[i]);
    }

    SortingStudentsByGPA students = new SortingStudentsByGPA();

    //Вывод до сортировки.
    System.out.print (stud[0].getGPA());
    for (int i = 1; i < 10; i++) {
       System.out.print (", "+stud[i].getGPA());
    }

    //Сортировка
    stud = students.fastSort(stud, 0, 9);

    //Вывод после сортировки      
    System.out.print ("\nОтсортированный список: "+stud[0].getGPA()); 
    for (int i = 1; i < 10; i++) {
      System.out.print (", "+stud[i].getGPA());
    }
  }
}

