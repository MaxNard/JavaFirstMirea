package ru.mirea.task10;

class Order9 {
    static int order (int n, int m){
        if (n%2==0)
        {
            m--;
            n/=2;
            if ((n==0)&(m==0))
            {
                return 1;
            }
            if ((n==0)&(m>0))
            {
                return order (n*2,m);
            }
            if ((m==0)&(n>0))
            {
                return order(n*2+1,m);
            }
            if (n>0 & m>0) return order(n*2+1,m)+order(n*2,m);
        }
        else
        {
            n/=2;
            n--;
            if ((m==0)&(n>0)) return 0; //Тупик
            if (m==0) return 1;
            return (order(n*2,m));
        }
        return 0;
    }

    public static void main(String[] args) {
        int a=15;//00
        int b=18;//11
        int RES=0;
        if (a!=0) RES+=order(a*2+1,b);
        if (b!=0) RES+=order(a*2,b);
        System.out.println(RES);
    }
}
