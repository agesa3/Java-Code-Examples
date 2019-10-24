package com.company;

import java.util.Scanner;


public class FahreneitToCelcius {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter the temperature in celcius: ");
        fahrenheit=input.nextDouble();

        //from fahr to degrees
        double celcius=(5.0/9)*(fahrenheit-32);
        System.out.println("The temperature in degrees celcius is: "+ celcius);
    }
}
