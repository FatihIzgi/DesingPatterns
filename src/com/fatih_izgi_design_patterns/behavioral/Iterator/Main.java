package com.fatih_izgi_design_patterns.behavioral.Iterator;

public class Main {
    public static void main(String[] args) {

        StudentContainer studentContainer = new StudentContainer();

        for (Iterator iterator = studentContainer.getIterator(); iterator.hasNext(); ) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName());

        }
    }
}
