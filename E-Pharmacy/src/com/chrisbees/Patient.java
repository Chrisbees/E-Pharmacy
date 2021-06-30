package com.chrisbees;

public class Patient {
    private int id;
    private String name;
    private String address;
    private int age;
    private String mobileNumber;
    private static boolean card;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", card=" + card +
                '}';
    }

    public Patient(int id, String name, String address, int age, String mobileNumber, boolean card) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.card = card;
    }

    public static void purchaseCard() {
        if (card) {
            System.out.println("You are already a registered patienet");
        }
        else {
            System.out.println("Kindly purchase a card");
        }
    }
}
