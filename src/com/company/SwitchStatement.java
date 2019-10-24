package com.company;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        int monthNumber;
        Scanner input=new Scanner(System.in);
        monthNumber=input.nextInt();

        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Enter a month btw jan and march");
        }

    }
}
