package ru.mirea.task10;

class Palindrome8 {
    static void palindrome (String s,int i){
        if (s.charAt(i)!=s.charAt(s.length()-1-i)){
            System.out.print ("NO");
            return;
        }
        else
        {
            if (i==s.length()-1-i || i+1==s.length()-1-i){
                System.out.print ("YES");
                return;
            }
            else palindrome (s, ++i);
        }
    }

    public static void main(String[] args) {
        palindrome("abcaacba",0);
    }
}
