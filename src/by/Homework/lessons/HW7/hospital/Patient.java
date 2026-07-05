package by.Homework.lessons.HW7.hospital;

import java.util.Objects;

public class Patient implements Comparable{
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private Gender gender;
    private String diagnosis;

    public Patient(int id, String firstname, String lastname, int age, Gender gender, String diagnosis) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.diagnosis = diagnosis;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        //Прикольное автозаполнение, но мы привыкли к стринге
        //return id == patient.id && age == patient.age && Objects.equals(firstname, patient.firstname) && Objects.equals(lastname, patient.lastname) && gender == patient.gender && Objects.equals(diagnosis, patient.diagnosis);
        return patient.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        //Прикольное автозаполнение, но мы привыкли к стринге
        //return Objects.hash(id, firstname, lastname, age, gender, diagnosis);
        return Objects.hash(this.toString());
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Object o) {
        /* Допустим
        1. мне нравится проверка класса
        2. после переделки в TreeSet смысл в equals и hashCode теряется, вроде
         */
        if (o == null || getClass() != o.getClass()) return -1;
        Patient patient = (Patient) o;
        return this.id == patient.getId() ? 0: 1;
    }
}
