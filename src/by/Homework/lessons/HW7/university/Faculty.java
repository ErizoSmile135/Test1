package by.Homework.lessons.HW7.university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facName;
    private List<Group> groups;
    private FacultyStatus status;

    public Faculty(String facName) {
        this.facName = facName;
        this.groups = new ArrayList<>();
        this.status = FacultyStatus.ACTIVE;
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

    public void transferToGroup(Group newGroup){
        if (newGroup.getStudents().size() < 2) {
            if (this.groups.size() == 1 && this.groups.getFirst().equals(newGroup))
                System.out.println("Эта группа уже есть на факультете. И она единственная!");
            else {
                for (Group gr: this.groups){
                    if (!gr.equals(newGroup)){
                        gr.getStudents().addAll(newGroup.getStudents());
                        //newGroup.getStudents().removeAll(newGroup.getStudents());
                        newGroup.getStudents().clear();     //чтобы студенты не дублировались
                        //Можно было бы удалить группу из списка групп, но я этот список не знаю
                        //Передавал бы в метод оригинальный список и группу (List<Group> groups, Group newGroup)
                        return;
                    }
                }
            }
        }
    }

    public FacultyStatus getStatus() {
        return status;
    }

    public void setStatus() {
        int countStudent = 0;
        for (Group gr: this.groups){
            countStudent += gr.getStudents().size();
        }
        this.status = countStudent < 20 ? FacultyStatus.NOT_ACTIVE: FacultyStatus.ACTIVE;
    }
}
