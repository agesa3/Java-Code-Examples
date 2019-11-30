package com.company;

public class Multiplication {
    public static void main(String[] args){
        System.out.println("   Multiplication Table");

        System.out.println("  ");

        for(int j=1;j<=9;j++){
            System.out.printf("%4d ",j);
        }
        System.out.println("\n--------------------------------------------");

        //Display the body
        for(int i=1;i<=9;i++){
            System.out.print(i +"|");
            for(int j=1;j<=9;j++){
                //Display the product and align it properly
                System.out.printf("%4d ",i*j);
            }
            System.out.println();
        }

    }
}
