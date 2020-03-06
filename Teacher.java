package ru.test;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private ArrayList<Group> groups;

    public Teacher(String surname, String name) {
        super(surname, name);
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    private String getAllGroups() {
        return groups.toString();
    }

    public Group getGroupByIndex(int index) {
        return groups.get(index);
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groups = '" + groups.toString() + '\'' +
                '}';
    }
}