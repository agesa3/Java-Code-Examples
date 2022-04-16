package com.company;

import java.util.Date;

public class Shapes2D {
    public static void main(String[] args) {

        System.out.println("---------------Circle------------------------------------");
        CircleN circleN = new CircleN();
        circleN.setDoc(new Date());
        circleN.setColor("Yellow");
        circleN.setName("Circle");
        circleN.setRad(7);
        circleN.display();

        System.out.println("---------------Rectangle------------------------------------");

        RectangleN rectangleN = new RectangleN();
        rectangleN.setDoc(new Date());
        rectangleN.setColor("Red");
        rectangleN.setName("Rectangle");
        rectangleN.setWidth(8);
        rectangleN.setLength(16);
        rectangleN.display();

        System.out.println("-------------------------Triangle--------------------------");

        Triangle triangle = new Triangle();
        triangle.setDoc(new Date());
        triangle.setColor("Blue");
        triangle.setName("Triangle");
        triangle.setBase(3);
        triangle.setHeight(4);
        triangle.display();

    }
}

class Shapes {
    private Date doc;
    private String color;
    private String name;

    public void setDoc(Date doc) {
        this.doc = doc;
    }

    public Date getDoc() {
        return doc;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 0;
    }

    // public double getPerimeter() { return 0.0; }
    public void display() {
        System.out.println("Name of Shape: " + getName());
        System.out.println("Color of shape: " + getColor());

    }

}

class CircleN extends Shapes {
    private float rad;

    public void setRad(float rad) {
        this.rad = rad;
    }

    public float getRad() {
        return rad;
    }

    public double getArea() {
        return 3.142 * getRad() * getRad();
    }

    public double getPerimeter() {
        return 2 * 3.142 * getRad();
    }

    public void display() {
        super.display();
        System.out.println("Radius: " + getRad());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class RectangleN extends Shapes {
    private double length;
    public double width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    public void display() {
        super.display();

        System.out.println("Length: " + getLength() + "   " + "Width: " + getWidth());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class Triangle extends Shapes {
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        double sum = ((getBase() * getBase()) + (getHeight() * getHeight()));
        return Math.sqrt(sum);
    }

    public double getArea() {
        return 0.5 * getHeight() * getBase();
    }

    public double getPerimeter() {
        return getBase() + getHeight() + getHypotenuse();
    }

    public void display() {

        super.display();
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());

    }
}


