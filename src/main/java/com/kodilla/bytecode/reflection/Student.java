package com.kodilla.bytecode.reflection;

public class Student {

    private String indexNumber;

    public Student(){
        this.indexNumber = RandomTextGenerator.generateRandomText(10);
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
