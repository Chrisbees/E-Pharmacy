package com.chrisbees;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private String name;
    private String address;
    List<Patient> patientList;

    public Pharmacy(String name, String address) {
        this.name = name;
        this.address = address;
        this.patientList = new ArrayList<Patient>();
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", patientList=" + patientList +
                '}';
    }

    public void addPatient(Patient patients) {
        this.patientList.add(patients);
    }
}
