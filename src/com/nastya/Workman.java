package com.nastya;

public class Workman {
    private String name;
    private String position;
    private String email;
    private int age;
    private int phoneNumber;
    private int wage;


    public Workman ( String name , String position , String email , int age , int phoneNumber , int wage ) {
        this.name = name;
        this.position = position;
        this.email = email ;
        this.phoneNumber = phoneNumber ;
        this.wage = wage ;
        this.age = age ;
    }
    public void outToConcole () {
        System.out.println ("Сотрудник " + name + " , возраст " + age + " , e-mail:" + email + " номер: " + phoneNumber + ", должность- " + position + " , зарплата- " + wage);

    }

    public String getName () {
        return name;
    }

    public String getPosition () {
        return position;
    }

    public String getEmail () {
        return email;
    }

    public int getAge () {
        return age;
    }

    public int getPhoneNumber () {
        return phoneNumber;
    }

    public int getWage () {
        return wage;
    }

}
