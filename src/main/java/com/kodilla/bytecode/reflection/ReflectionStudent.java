package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;


public class ReflectionStudent {

    public static void main(String[] args) throws NoSuchFieldException {
        Student student = new Student();
        Field indexNumberField = Student.class.getDeclaredField("indexNumber");
        indexNumberField.setAccessible(true);
        System.out.println(student.getIndexNumber());
    }
}
