package ru.mirea.task12;

public interface Comparator {
    Student[] fastSort(Student[] arr, int left, int right);
}

class Student
{
  private int GPA;
  public Student(int GPA) {
    this.GPA = GPA;
  }

  public int getGPA()
  {
    return GPA;
  }
}