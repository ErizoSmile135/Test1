package by.Homework.lessons.HW7.hospital;

public enum Gender {
    MALE ("Мужской"),
    FEMALE ("Женский");

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    Gender(String title) {
        this.title = title;
    }
}
