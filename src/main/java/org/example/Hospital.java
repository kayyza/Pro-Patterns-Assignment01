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
    removes a patient from the list by name
     */
   public void removePatient(String name) {
       // checking if list is empty
        if (head == null) {
            System.out.println("Hospital data is empty.");
            return;
        }
        // checks if the patient to be removed is the first patient in the list
        if (((Patient) head.patient).getName().equals(name)) {
            head = head.next;
            System.out.println("Patient removed successfully.");
            return;
        }
        // traverse the list to find the patient
        Node<T> current = head;
        while (current.next != null) {
            if (((Patient) current.patient).getName().equals(name)) {
                current.next = current.next.next;
                System.out.println("Patient removed successfully.");
                return;
            }
            current = current.next;

        }
       System.out.println("Patient not found.");
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
