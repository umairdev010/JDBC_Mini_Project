package org.practice.umair;

public class Students {
    private int id;
    private String name;
    private int marks;

    public Students(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {

        return ("[ id = " + id + " name = " + name + " marks = " + marks + " ]");
    }
}
