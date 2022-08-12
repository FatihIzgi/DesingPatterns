package com.fatih_izgi_design_patterns.behavioral.Iterator;

class StudentContainer implements Container{

    Student s1 = new Student(1,"Ad1","Soyad1");
    Student s2 = new Student(2,"Ad2","Soyad2");
    Student s3 = new Student(3,"Ad3","Soyad3");

    Student[] students = {s1,s2,s3};

    @Override
    public Iterator getIterator() {
        return new StudentIterator(students);
    }

}
