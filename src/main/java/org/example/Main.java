package org.example;

public class Main {
    public static void main(String[] args) {
        Hospital<Patient> patientList = new Hospital<>();

        Patient patient1 = new Patient("Hank Green", 62, "Low", false);

        patientList.addPatient(patient1);

        System.out.println();
        System.out.println("List of patients:");
        patientList.display();
    }
}