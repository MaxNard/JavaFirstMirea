package ru.mirea.task12;

public class SortingStudentsByGPA implements Comparator {

  public SortingStudentsByGPA(){}

  public Student[] fastSort(Student[] arr, int leftP, int rightP)
  {
   int left=leftP;
   int right=rightP;
   int pivot = arr[(left+right) / 2].getGPA();

   while (left<=right)
   {
      while (arr[left].getGPA() > pivot)
        left++;
      while (arr[right].getGPA() < pivot)
        right--;
      if (left<= right)
      {
        Student temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
    if (right > leftP)fastSort(arr, leftP, right);
    if (left< rightP) fastSort(arr, left, rightP);

    return arr;
  }

}