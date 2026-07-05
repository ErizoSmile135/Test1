package by.Homework.lessons.HW7.university;

public enum FacultyStatus {
    ACTIVE ("Активный"),
    NOT_ACTIVE ("Неактивный");

    private String title;

    FacultyStatus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
