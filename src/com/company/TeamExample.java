package com.company;

public class TeamExample {
    public static void main(String[] args){
        Member myMember=new Member("Stark Tony","Defender",10,25);
        System.out.println(myMember.getName());
        System.out.println(myMember.getTeamTitle());
        System.out.println(myMember.getTeamNumber());
        System.out.println(myMember.getAge());


    }
}

class Member{
    private String name;
    private String teamTitle;
    private int teamNumber;
    private int age;

    public Member(String name,String teamTitle,int teamNumber,int age){
        this.name=name;
        this.teamTitle=teamTitle;
        this.teamNumber=teamNumber;
        this.age=age;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeamTitle(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
