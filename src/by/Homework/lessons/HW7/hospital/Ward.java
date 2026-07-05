package by.Homework.lessons.HW7.hospital;

import java.util.Set;
import java.util.TreeSet;

public class Ward {
    private int number;
    private WardType type;
    private TreeSet<Patient> patientList;

    public Ward(int number, WardType type, TreeSet<Patient> patientList) {
        this.number = number;
        this.type = type;
        this.patientList = patientList;
    }

    public void addPatient(Patient patient){
        if (this.patientList.size() < 3 && this.type == (patient.getGender() == Gender.MALE ? WardType.MALE_TYPE: WardType.FEMALE_TYPE)) {
            //я сделал через Set, но позже подумал что мб можно было и через проверку contains или equals()
            if (this.patientList.add(patient))
                System.out.println("add patient: " + patient);
            else System.out.println("Пациент с такими данными уже есть в палате");
        } else System.out.println("Невозможно добавить этого пациента в палату");
    }

    public void addPatientWithDiagnosis(Patient patient){
        if (!this.patientList.isEmpty()) {
            String diagnosisInWard = this.patientList.getFirst().getDiagnosis();
            if (diagnosisInWard.equals(patient.getDiagnosis())) addPatient(patient);
            else System.out.println("Диагноз пациента должен быть " + diagnosisInWard);
        } else addPatient(patient);
    }

    public TreeSet<Patient> getPatientList() {
        return patientList;
    }

    public int getNumber() {
        return number;
    }

    public WardType getType() {
        return type;
    }

    public void printPatientsInfo(){
        System.out.println("Ward " + this.number + ":");
        for (Patient patient: this.patientList){
            System.out.println(patient);
        }
    }
}
