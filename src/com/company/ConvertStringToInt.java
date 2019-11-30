package com.company;

public class ConvertStringToInt {
    public static void main(String[] args){
        String numberOne="1234";
        String myNumber="45";

        /*
        double answer=Double.parseDouble(sum);
        System.out.println(answer); //wrong*/
        int intValue = Integer.parseInt(numberOne);
        System.out.println(intValue);

        double doubleValue = Double.parseDouble(myNumber);
        System.out.println(doubleValue);

        double sum=doubleValue+intValue;
        System.out.println("The sum is : "+sum);



    }
}
