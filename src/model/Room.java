package model;

import java.util.ArrayList;

public class Room {
    static int lastRoomID = 0;
    private int roomID;
    private Building building;
    private int capacity;
    private ArrayList<Patient> patients;
    private ArrayList<Equipment> equipment;

    public Room(Building bldng) {
        this(bldng, 0);
    }

    public Room(Building bldng, int cap) {
        roomID = lastRoomID + 1;
        building = bldng;
        capacity = cap;
        patients = new ArrayList<Patient>();
        equipment = new ArrayList<Equipment>();
        lastRoomID = roomID;
    }

    public int getRoomID() {
        return roomID;
    }

    public Building getBuilding() {
        return building;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean setCapacity(int cap) {
        capacity = cap;
        return true;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() < capacity) {
            patients.add(patient);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePatient(int patientID) {
        for (Patient p :
                patients) {
            if (p.getPatientID() == patientID) {
                patients.remove(p);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Equipment> getEquipment() {
        return equipment;
    }

    public boolean addEquipment(Equipment equip) {
        equipment.add(equip);
        return true;
    }

    public boolean removeEquipment(int equipID) {
        for (Equipment e :
                equipment) {
            if (e.getEquipID() == equipID) {
                equipment.remove(e);
                return true;
            }
        }
        return false;
    }

}
