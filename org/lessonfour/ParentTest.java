package com.proftelrun.org.lessonfour;

public class ParentTest {
    public static void main(String[] args) {
        Parent parent;

        parent = new ChildOne();
        parent.printGreetings();

        parent = new ChildTwo();
        parent.printGreetings();

        parent = new MiddleChild();
        parent.printGreetings();

    }
}
