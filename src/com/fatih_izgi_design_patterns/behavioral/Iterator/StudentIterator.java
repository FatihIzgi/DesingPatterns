package com.fatih_izgi_design_patterns.behavioral.Iterator;

class StudentIterator implements Iterator{

    private int index;
    private Student[] students;

    public StudentIterator(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        if(index<students.length){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return students[index++];
        }
        else{
            return null;
        }
    }

}

