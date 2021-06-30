package com.chrisbees;

import java.util.List;

public class Tuberculosis extends Ailments {
    @Override
    public String toString() {
        return "Tuberculosis";
    }

    @Override
    public void about_Ailment() {

        super.about_Ailment();
        System.out.println("Tuberculosis\nTuberculosis (TB) is an infectious disease that usually affects the lungs, though it can affect any organ in the body. It can develop when bacteria spread through droplets in the air. TB can be fatal, but in many cases, it is preventable and treatable. Causes\n" +
                "M. tuberculosis bacteria cause TB. They can spread through the air in droplets when a person with pulmonary TB coughs, sneezes, spits, laughs, or talks.\n" +
                "Only people with active TB can transmit the infection. However, most people with the disease can no longer transmit the bacteria after they have received appropriate treatment for at least 2 weeks.\n");
    }

    @Override
    public void symptoms() {

        super.symptoms();
        System.out.println("Symptoms\nLTuberculosis (TB) is an infectious disease that usually affects the lungs, though it can affect any organ in the body. It can develop when bacteria spread through droplets in the air. TB can be fatal, but in many cases, it is preventable and treatable.\n" +
                "\n" +
                "In the past, TB, or “consumption,” was a major cause of death around the world. Following improvements in living conditions and the development of antibiotics, the prevalence of TB fell dramatically in industrialized countries.\n");
    }

    @Override
    public void prescriptions() {
        super.prescriptions();
    }

    @Override
    public void dosage1_10() {
        super.dosage1_10();

    }

    @Override
    public void dosage11_20() {
        super.dosage11_20();
    }

    @Override
    public void dosage21_Above() {
        super.dosage21_Above();
    }
}
