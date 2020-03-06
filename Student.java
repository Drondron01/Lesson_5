package ru.test;
public class Student extends Person {

    private Teacher teacher;

    public Student(String surname, String name) {
        super(surname, name);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}