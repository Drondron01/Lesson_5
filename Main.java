package ru.test;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();

        int index = 0;
        for(int i = 0; i < 10; i++) {
            index++;
            Teacher teacher = new Teacher("Сидоров"+ index, "Николай");
            for(int k = 0; k < 5; k++) {
                Group group = new Group("group" + index);
                for (int j = 0; j < 10; j++) {
                    index++;
                    group.addStudent(new Student("Петров" + index, "Иван"));
                    group.addStudent(new Student("Иванов" + index, "Иван"));
                }
                teacher.addGroup(group);
            }
            teachers.add(teacher);
        }

        //System.out.println(teachers.toString());

        //System.out.println("teacher name:" + teachers.get(2) + "teacher group:" + teachers.get(2).getGroups());
        System.out.println("teacher name:" + teachers.get(2));
    }
}
