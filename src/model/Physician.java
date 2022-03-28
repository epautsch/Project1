package model;

import java.util.ArrayList;

public class Physician extends Employee {
    private ArrayList<Patient> previousPatients;
    private ArrayList<Patient> activePatients;

    public Physician(String name) {
        super(name);
        previousPatients = new ArrayList<Patient>();
        activePatients = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPreviousPatients() {
        return previousPatients;
    }

    public ArrayList<Patient> getActivePatients() {
        return activePatients;
    }
}
