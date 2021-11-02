package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir tarih giriniz");
        int year;
        year=input.nextInt();
        if (year%400==0){
            System.out.println("bu bir artık yıldır");
        }else if (year%4==0&&year%400==0){
            System.out.println("bu bir artık yıldır");
        }else
            System.out.println("bu bir artık yıl değildir");


    }
}
