package com.company;

import java.util.Date;

public class PersonInheritance {
    public static void main(String[] args){
        Student student=new Student();
        student.setName("Agesa Collins");
        student.setDob(new Date());
        student.setDor(new Date());
        student.setProgramme("Bachelor of Computer Science");
        student.setGender("Male");
        student.setRegNo("COM/B/01-00093/2018");
        student.display();

    }
}
class Person{
    private Date dob;
    private String name;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Date of Birth: "+getDob());
        System.out.println("Gender: "+getGender());
    }
}
class Student extends Person{
    private String regNo;
    private String programme;
    private Date dor;

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getProgramme() {
        return programme;
    }

    public void setDor(Date dor) {
        this.dor = dor;
    }

    public Date getDor() {
        return dor;
    }
    public void display(){
        super.display();
        System.out.println("Reg Number: "+getRegNo());
        System.out.println("Programme: "+getProgramme());
        System.out.println("Date of Registration: "+getDor());
    }
}

