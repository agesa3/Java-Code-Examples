package com.company;

public class Circle {
    public static void main(String[] args){
        CircleE c=new CircleE();
        //c.setRad(7);
        c.area();
        c.perimeter();
        c.display();

    }
}

class CircleE{
    private int rad=7;
    public CircleE(){ }
    public double area(){
        return 3.142*rad*rad;
    }
    public double perimeter(){
        return 2*3.142*rad;
    }
    public void setRad(int r){
        rad=r;
    }
    public double getRad(){
        return  rad;
    }
    public void display(){
        System.out.println("The radius is: "+ rad +" and the area is : "+ area() + " and the perimeter "+ perimeter() );

    }
}
