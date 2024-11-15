package com.comarch.szkolenia.enkapsulacja;

import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        System.out.println(x == y);

        Square s1 = new Square(5);
        Square s2 = new Square(6);

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        String text1 = "ABC";
        String text2 = "ABC";

        System.out.println(text1.equals(text2));

        System.out.println(s1.equals(new Random()));

        String t1 = "OK";
        String t2 = "OK";

        System.out.println(t1);
        System.out.println(t2);

        t1 = t1 + "X";

        System.out.println(t1);
        System.out.println(t2);

        String s = new String("ABC");
        String s5 = s;
        System.out.println(System.identityHashCode(s));
        method(s);
    }

    public static void method(String s) {
        System.out.println(System.identityHashCode(s));
    }
}
