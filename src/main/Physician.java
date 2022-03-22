package main;

import main.Employee;
import main.Patient;

import java.util.ArrayList;

public class Physician extends Employee {
    private ArrayList<Patient> previousPatients;
    private ArrayList<Patient> activePatients;

    public Physician(String name) {
        super(name);
    }

    public ArrayList<Patient> getPreviousPatients() {
        return previousPatients;
    }

    public ArrayList<Patient> getActivePatients() {
        return activePatients;
    }
}
