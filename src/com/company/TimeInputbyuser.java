package com.company;

import java.util.Scanner;
public class TimeInputbyuser {
    public static void main(String[] args){
        int hour,min,sec;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the hour: ");
        hour=input.nextInt();
        System.out.println("Enter the minute: ");
        min=input.nextInt();
        System.out.println("Enter the second: ");
        sec=input.nextInt();

        TimeTwo example=new TimeTwo();
        example.setHour(hour);
        example.setMinutes(min);
        example.setSecond(sec);
        example.display();

        example.next();
        example.display();



    }
}
class TimeTwo{
    private int hour;
    private int minutes;
    private int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }
    public void next(){
        if(hour==23 && minutes==59 && second==59){
            hour=0;
            minutes=0;
            second=0;
        }
        else if(minutes ==59 && second==59){
            hour+=1;
            minutes=0;
            second=0;
        }
        else if(second==59){
            minutes+=1;
            second=0;
        }
        else {
            second+=1;
        }
    }
    public void display(){
        System.out.println("The time: "+ hour+" : "+minutes+ " : "+ second);
    }
}
