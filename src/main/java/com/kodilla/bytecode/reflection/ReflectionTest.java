package com.kodilla.bytecode.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Book> descriptor = Book.class;
//        System.out.println(descriptor.getName());
        for (Method m : descriptor.getMethods()) {
            System.out.println(m.getName());
        }

        int modifers = descriptor.getModifiers();
        boolean isPublic = Modifier.isPublic(modifers);
        boolean isAbstract = Modifier.isAbstract(modifers);

        System.out.println(isPublic);
        System.out.println(isAbstract);

        Constructor<Book> constructor = descriptor.getConstructor(new Class[]{String.class, String.class, int.class});

        Book book = constructor.newInstance("Title", "Signature", 2000);

        System.out.println(book.getTitle());
        System.out.println(book.getSignature());
        System.out.println(book.getYear());
    }
}
