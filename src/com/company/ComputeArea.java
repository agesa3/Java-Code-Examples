package com.company;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
        CircleDetails cc = new CircleDetails();
        cc.circleRad();
        cc.area();
        cc.display();
    }
}

class CircleDetails {
    public double rad;

    CircleDetails() {

    }

    public void setRad(double r) {
        rad = r;
    }

    public double getRad() {
        return rad;
    }

    public void circleRad() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        rad = input.nextDouble();
    }

    public double area() {
        return rad * rad * 3.142;
    }

    public void display() {
        System.out.println("The area of the circle is: " + area());
    }


}

