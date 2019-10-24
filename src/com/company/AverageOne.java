package com.company;

import java.util.Scanner;

public class AverageOne {
    public static void main(String[] args) {
        AverageNumber a = new AverageNumber();
        a.numOne();
        a.average();
        a.display();
    }

}

class AverageNumber {
    public double x;
    public double y;
    public double aver;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double average() {
        return (x + y) / 2;
    }

    public void numOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value 1:");
        x = input.nextDouble();

        System.out.println("Enter value 2: ");
        y = input.nextDouble();

    }

    public void display() {
        System.out.println("The average is: " + average());
    }

}


