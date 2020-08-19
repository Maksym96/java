package com.gmail.maximmelanich;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();

        int a = number/10000;
        int b = number%10000/1000;
        int c = number%10000/100/7;
        int d = number%10000/100/5;
        int e = number%10000/50/11;



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
