package org.example;

public class Main {
    public static void main(String[] args) {
        Hospital<Patient> patientList = new Hospital<>();

        Patient patient1 = new Patient("Hank Green", 62, "Low", false);
        Patient patient2 = new Patient("Kayleigh Herron", 22, "High", false);
        Patient patient3 = new Patient("John Doe", 52, "Critical", true);
        Patient patient4 = new Patient("Marissa Smith", 19, "Low", false);

        patientList.addPatient(patient1);
        patientList.addPatient(patient2);
        patientList.addPatient(patient3);
        patientList.addPatient(patient4);

        patientList.removePatient("John Doe");

        System.out.println();
        System.out.println("List of patients:");
        patientList.display();
    }
}