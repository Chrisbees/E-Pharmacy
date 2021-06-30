package com.chrisbees;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Ailments> ailments;//Import Scanner to accept user Input

    public static void main(String[] args) {
        // write your code here
        //instantiate objects of our classes
        Maleria maleria = new Maleria();
        HepatitisB hepatitisB = new HepatitisB();
        Tuberculosis tuberculosis = new Tuberculosis();
        Typhoid typhoid = new Typhoid();
        Diabetes diabetes = new Diabetes();
        ailments = new ArrayList<Ailments>();
        ailments.add(maleria);
        ailments.add(hepatitisB);
        ailments.add(tuberculosis);
        ailments.add(typhoid);
        ailments.add(diabetes);

        Pharmacy pharmacy = new Pharmacy("Saint Louis", "Lagos");
        Patient patient1 = new Patient(1, "Obi", "Enugu", 30, "0901343252", true);
        Patient patient2 = new Patient(2, "Mekus", "Ibadan", 18, "0808843250", false);
        pharmacy.addPatient(patient1);
        pharmacy.addPatient(patient2);


        System.out.println("Welcome  to E-PHARMACY DRUG PRESCRIPTION SYSTEM.\nKindly select from the options provided below: \n" +
                "1. See a doctor \n" +
                "2. See list of ailments, symptoms, drugs and prescription \n" +
                "3. Purchase membership Card \n" +
                "4. Find out appointment dates \n" +
                "5. View options again");

        boolean flag = false;
        while (!flag) {
            flag = true;
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please hold on while we assign you to a doctor");
                    break;
                case 2:
                    listOfAilments();

                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            maleria.about_Ailment();
                            maleria.symptoms();
                            maleria.prescriptions();
                            maleria.dosage1_10();
                            maleria.dosage11_20();
                            maleria.dosage21_Above();
                            break;
                        case 2:
                            hepatitisB.about_Ailment();
                            hepatitisB.symptoms();
                            hepatitisB.prescriptions();
                            hepatitisB.dosage1_10();
                            hepatitisB.dosage11_20();
                            hepatitisB.dosage21_Above();
                            break;
                        case 3:
                            tuberculosis.about_Ailment();
                            tuberculosis.symptoms();
                            tuberculosis.prescriptions();
                            tuberculosis.dosage1_10();
                            tuberculosis.dosage11_20();
                            tuberculosis.dosage21_Above();
                            break;
                        case 4:
                            typhoid.about_Ailment();
                            typhoid.symptoms();
                            typhoid.prescriptions();
                            typhoid.dosage1_10();
                            typhoid.dosage11_20();
                            typhoid.dosage21_Above();
                            break;
                        case 5:
                            diabetes.about_Ailment();
                            diabetes.symptoms();
                            diabetes.prescriptions();
                            diabetes.dosage1_10();
                            diabetes.dosage11_20();
                            diabetes.dosage21_Above();
                            break;
                        case 6: ;
                        default:

                    }
                    break;
                case 3:
                    purchaseCard();
                    break;
                case 4:
                    appointmentDates();
                    break;
                case 5:
                    System.out.println("Welcome  to E-PHARMACY DRUG PRESCRIPTION SYSTEM.\nKindly select from the options provided below: \n" +
                            "1. See a doctor \n" +
                            "2. See list of ailments, symptoms, drugs and prescription \n" +
                            "3. Purchase membership Card \n" +
                            "4. Find out appointment dates \n" +
                            "5. View options again");
                default:


            }
            flag = false;

        }

    }

    private static void appointmentDates() {
        System.out.println("These are out appointment days");
        System.out.println("Mondays-Saturdays 8am-9pm");
    }

    private static void purchaseCard() {
        Patient.purchaseCard();
    }

    public static void listOfAilments() {
        for (int i = 0; i < ailments.size(); i++) {
            System.out.println(i+1 + ". " + ailments.get(i));
        }
    }
}
