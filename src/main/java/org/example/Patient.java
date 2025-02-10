package org.example;

public class Patient<T> {
    private String name;
    private int age;
    private String severity;
    private boolean inICU;

    public Patient(String name, int age, String severity, boolean inICU) {
        this.name = name;
        this.age = age;
        this.severity = severity;
        this.inICU = inICU;
    }

    // updates patient status to ICU
    public void markAsICU() {
        this.inICU = true;
    }

    // changes a patient's severity
    public void updateSeverity(String newSeverity) {
        this.severity = newSeverity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public boolean isInICU() {
        return inICU;
    }

    public void setInICU(boolean inICU) {
        this.inICU = inICU;
    }

    @Override
    public String toString() {
        return "[Name: " + name +  ", Age: " + age + ", Severity: " + severity + ", In ICU: " + inICU + "]";
    }
}
