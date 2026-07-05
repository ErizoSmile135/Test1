package by.Homework.lessons.HW7.university;

import java.time.LocalDate;

public class Student {
    private String name;
    private String lastname;
    private LocalDate birthday;
    private int year;
    private double gpa;

    public Student(String name, String lastname, LocalDate birthday, double gpa) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.year = birthday.getYear();
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
