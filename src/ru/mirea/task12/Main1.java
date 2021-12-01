class Main {
  public static void main(String[] args) {
    int [] arr = {10, 7, 5, 1, 2};
    for (int i = 0; i<arr.length; i++){

      int buf = arr[i];

      int j = i - 1;

      for (; j>=0; j--){
        if (buf<arr[j]){
          arr[j+1]=arr[j];
        }
        else{
          break;
        }
      }
      arr[j+1]  = buf;
    }

    System.out.print(arr[0]);
    for (int p = 1; p < arr.length; p++){
      System.out.print(", "+arr[p]);
    }
  }

  class Student{
    private int i = 0;
  }
}
