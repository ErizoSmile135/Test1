package by.Homework.lessons.HW7.hospital;

public enum WardType {
    MALE_TYPE ("Мужская"),
    FEMALE_TYPE ("Женская");

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    WardType(String title) {
        this.title = title;
    }
}
