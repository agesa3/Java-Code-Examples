package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner sec=new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int second=sec.nextInt();

        int hour=second/3600;
        int minutes=(second%3600)/60;
        int seconds=second%60;

        System.out.println("Time: "+ hour+":"+minutes+":"+seconds);
    }
}
