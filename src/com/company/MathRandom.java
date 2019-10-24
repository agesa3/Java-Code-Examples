package com.company;

public class MathRandom {
    public static void main(String[] args){

        // 1. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.println("The first value is: "+number1);
        System.out.println("The first value is: "+number2);
    }
}
