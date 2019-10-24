package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        checkEvenOdd chec = new checkEvenOdd();
        chec.numbers();
        chec.check();
    }

}

class checkEvenOdd {
    public double x;


    public void numbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value 1: ");
        x = input.nextDouble();

    }

    public void check() {
        if ((x % 2) == 0) {
            System.out.println("The number " + x + " is even");
        } else {
            System.out.println("The number " + x + " is odd.");
        }
    }
}
