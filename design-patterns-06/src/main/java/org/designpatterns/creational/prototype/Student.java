package org.designpatterns.creational.prototype;

public class Student {

    private String name;
    private String family;

    public Student(String name, String family) {
        this.name = name;
        this.family = family;
    }

    private Student(Student student) {
        this.name = student.name;
        this.family = student.family;
    }

    public Student clone() {
        return new Student(this);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student("sara", "nazemi");
        System.out.println(s);
        Student s2 = s.clone();
        System.out.println(s2);
    }
}