package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        whileloop oneEg = new whileloop();
        oneEg.loopOne();
        oneEg.loopTwo();
        oneEg.dowhileloop();

    }
}

class whileloop {
    public int sum = 0;
    public int i = 1;

    public void loopOne() {
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum is " + sum);
    }

    public void loopTwo() {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
// Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }

    public void dowhileloop() {
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }

}
