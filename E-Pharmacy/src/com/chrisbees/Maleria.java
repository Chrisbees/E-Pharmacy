package com.chrisbees;

import java.util.List;
import java.util.Scanner;

public class Maleria extends Ailments {

    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "Maleria";
    }

    @Override
    public void about_Ailment() {
        super.about_Ailment();
        System.out.println("Maleria\nMaleria is a disease caused by a Plasmodium parasite, transmitted by the bite of infected mosquitoes.\nThe severity of Maleria varies based on the species of Plasmodium");
    }

    @Override
    public void symptoms() {
        super.symptoms();
        System.out.println("\n\n");
        System.out.println("Symptoms\nPatient may experience pain in the muscles or abdomen, fever, chills, fatigue, malaise, shivering, sweating, Nausea or Vomiting. Most commonly headache, fast heart rate or Pale Skin");

    }

    @Override
    public void prescriptions() {
        super.prescriptions();
        System.out.println("\n\n");
        System.out.println("Prescribed Drugs\t\t\tAlomo Bitters");
    }

    @Override
    public void dosage1_10() {
        super.dosage1_10();
        System.out.println("\n\n");
        System.out.println("Dosage for age 1-10 years\nTake 5ml two time daily");
    }

    @Override
    public void dosage11_20() {
        System.out.println("\n\n");
        super.dosage11_20();
        System.out.println("Dosage for age 11-20 years\nTake 10ml two time daily");
    }

    @Override
    public void dosage21_Above() {
        super.dosage21_Above();
        System.out.println("\n\n");
        System.out.println("Dosage for age 21 and above \nTake 15ml two time daily");
    }
}
