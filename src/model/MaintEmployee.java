package model;

import java.util.ArrayList;

public class MaintEmployee extends Employee {
    private ArrayList<Maintenance> previousMaintenance;
    private ArrayList<Maintenance> activeMaintenance;

    public MaintEmployee(String name) {
        super(name);
    }

    public ArrayList<Maintenance> getPreviousMaintenance() {
        return previousMaintenance;
    }

    public ArrayList<Maintenance> getActiveMaintenance() {
        return activeMaintenance;
    }
}
