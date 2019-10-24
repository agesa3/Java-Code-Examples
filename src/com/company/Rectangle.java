package com.company;

public class Rectangle {
    public static void main(String[] args){
        Rec a=new Rec(8,5);
        a.area();
        a.perimeter();
        a.display();
        System.out.println("The location of this rectangle in memory is: "+ a);


        Rec b=new Rec();


        b.setLength(5);
        b.setWidth(2);
        b.area();
        b.perimeter();
        b.display();
        System.out.println("The location of this rectangle in memory is: "+ a);

        System.out.println(b.getCount());
    }
}
class Rec{
    private int length;
    private int width;
    public static int count;

    public Rec(){}
    public Rec(int length,int width){
        this.length=length;
        this.width=width;
        count++;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public static int getCount() {
        return count;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public int area(){
        return getLength()*getWidth();
    }
    public int perimeter(){
        return 2*(getWidth()+getLength());
    }
    public void display(){
        System.out.println("The length is: "+getLength()+ " width is: "+getWidth());
        System.out.println("The area of the rectangle is :  "+area());
        System.out.println("The perimeter of the rectangle is: "+perimeter());


    }
}
