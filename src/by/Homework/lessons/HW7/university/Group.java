package by.Homework.lessons.HW7.university;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupNum;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public Group(String groupNum) {
        this.groupNum = groupNum;
        this.students = new ArrayList<>();
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public void removeStudentsByMark(int mark) {
        List<Student> removeStudents = new ArrayList<>();
        for (Student student : this.students) {
            if (student.getGpa() < (double) mark) removeStudents.add(student);
        }

        removeStudents.forEach(st -> this.students.remove(st));     //учусь пользоваться
    }
}
