package com.company;

public class TimeNew {
    public static void main(String[] args) {
        NewTime t = new NewTime();
        t.setHour(20);
        t.setMinutes(50);
        t.setSeconds(50);
        t.next();
        t.display();
        t.nextTime(120);
        t.display();

    }
}

class NewTime {
    private int hour;
    private int minutes;
    private int seconds;

    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            hour = 00;
        }
    }

    public void setMinutes(int min) {
        if (min >= 0 && min < 60) {
            minutes = min;
        } else {
            minutes = 00;
        }
    }

    public void setSeconds(int sec) {
        if (sec >= 0 && sec < 60) {
            seconds = sec;
        } else {
            seconds = 00;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void next() {
        if (hour == 23 && minutes == 59 && seconds == 59) {
            hour = 00;
            minutes = 00;
            seconds = 00;
        } else if (minutes == 59 && seconds == 59) {
            hour += 1;
            minutes = 00;
            seconds = 00;
        } else if (seconds == 59) {
            minutes += 1;
        } else {
            seconds += 1;
        }
    }
    public void nextTime(int d){
        for (int i=0;i<d;i++){
            next();
        }
    }

    public void display() {
        System.out.println("The time is: " + hour + ":" + minutes + ":" + seconds);
    }
}