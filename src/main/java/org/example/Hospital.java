package org.example;



public class Hospital<T> {
    private Node <T> head;

    public class Node<T> {
        T patient;
        Node<T> next;

        public Node(T patient, Node<T> next) {
            this.patient = patient;
            this.next = next;
        }
    }

    /*
    adds a new patient
     */
    public void addPatient(T patient) {
        Node<T> newNode = new Node<>(patient, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Patient added successfully.");
    }


    /*
    prints all patients
     */
    public void display() {
        if (head == null) {
            System.out.println("No hospital data found.");
            return;
        }
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.patient.toString());
            current = current.next;
        }

    }
}
