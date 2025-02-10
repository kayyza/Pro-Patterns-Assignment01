package org.example;



public class Hospital<T> {
    private Node <T> head;

    public class Node<T> {
        T patient;
        Node<T> next;

        public Node(T patient, Node<T> next) {
            this.patient = patient;
            next = null;
        }
    }

    /*
    adds a new patient
     */
    public void addPatient(T patient) {
        if (head == null) {
            head = new Node<T>(patient, null);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.patient = patient;
        }
        System.out.println("Patient added successfully.");
    }



    public void display() {
        if (head != null) {
            Node<T> current = head;
            while (current != null) {
                System.out.println(current.patient);
                current = current.next;
            }
        }
    }
}
