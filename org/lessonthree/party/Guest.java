package com.proftelrun.org.lessonthree.party;

public abstract class Guest {
    private String name;
    private String gender;
    private int age;

    public Guest(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printGreetings(){
        System.out.println("Hello I am " + name);
    }
}
