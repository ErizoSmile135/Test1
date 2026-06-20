package by.Homework.lessons.HW7.university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facName;
    private List<Group> groups;

    public Faculty(String facName) {
        this.facName = facName;
        this.groups = new ArrayList<>();
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }
}
