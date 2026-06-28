package by.Homework.lessons.HW7.hospital;

import java.util.Set;

public class Department {
    private String departName;
    private Set<Ward> wardSet;

    public Set<Ward> getWardSet() {
        return wardSet;
    }

    public Department(String departName, Set<Ward> wardSet) {
        this.departName = departName;
        this.wardSet = wardSet;
    }

    public String getDepartName() {
        return departName;
    }
}
