package ru.mirea.task10;
class Inversia10 {
    static int inversia (int n, int m){
        if (n==0){
            return m;
        }
        else {
            m=m*10+n%10;
            return inversia(n/10,m);
        }
    }
    public static void main(String[] args) {
        System.out.println(inversia(1237654,0));
    }
}
