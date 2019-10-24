package com.company;

import java.util.Scanner;

public class StringObjects {
    public static void main(String[] args) {
        String message = "Java Programming is cool";
        String s1 = "I love";
        String s2 = " Java";
        Scanner input = new Scanner(System.in);

        System.out.println(message.length());///length of a string
        String finalString = s1.concat(s2);
        System.out.println(finalString); //concatenating two strings
        System.out.println(finalString.toUpperCase());
        System.out.println(finalString.toLowerCase());

        if (s1.equals(s2))
            System.out.println("string1 and string2 have the same contents");
        else
            System.out.println("string1 and string2 are not equal");

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);

        String message2 = "Welcome to Java";
        String message3 = message2.substring(0, 11) + "HTML";
        System.out.println(message3);

        System.out.print("Enter a character: ");
        String s = input.nextLine();
        //char ch = s.charAt(0);
        System.out.println("The character entered is " + s);


    }
}
