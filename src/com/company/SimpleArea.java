package com.company;

import javax.swing.*;
import java.util.Scanner;

public class SimpleArea {
    public static void main(String[] args){
       double rad;
       double area;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the radius: ");
       rad=input.nextDouble();

       area=rad*rad*3.142;

       //System.out.println("The area of the circle is: " +area);

        JOptionPane.showMessageDialog(null,"The area is: "+area );



    }
}
