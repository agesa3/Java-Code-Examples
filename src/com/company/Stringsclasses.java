package com.company;

public class Stringsclasses {
    public static void main(String[] args){
        String myName="Agesa";
        String myLanguage="Java";
        String myOtherName="   Agesa is my common used name  ";

        System.out.println(myName.equals(myLanguage)); //prints out false
        System.out.println(myOtherName.trim());//cuts/remove the extra spaces on the start and end of the string
    }
}
