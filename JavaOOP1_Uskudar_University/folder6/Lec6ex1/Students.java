

import java.util.*;

public class Students {

    private String name;
    private int id;
    private double gpa;
    int foo;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
        gpa = 0.0;
        foo = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public String toString() {
        return "Name: " + name + "\nId: " + id + "\nGPA: " + gpa + "\n";
    }
}

