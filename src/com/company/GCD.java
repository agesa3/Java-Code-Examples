package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
// Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        System.out.println("The GCD is: "+gcd(n1,n2));
    }
    public static int gcd(int a,int b){
        int gcd = 1; // Initial gcd
        int k = 2; //possible gcd

        while (k <= a && k <= b) {
            if (a % k == 0 && b % k == 0)
                gcd = k; // Update gcd
            k++;
        }
        return gcd;
    }
}
