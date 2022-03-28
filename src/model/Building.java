package model;

import java.util.ArrayList;

public class Building {
    static int lastBuildingID = 0;
    private int buildingID;
    private String buildingName;
    private ArrayList<Room> roomList;
    private int maxCapacity;
    private ArrayList<Room> vacancies;
    private ArrayList<MaintRequest> pendingMaintReqs;
    private ArrayList<MaintRequest> pastMaintReqs;
    private ArrayList<Appointment> pendingAppts;
    private ArrayList<Appointment> pastAppts;

    public Building(String name, int capacity) {
        buildingID = lastBuildingID + 1;
        buildingName = name;
        roomList = new ArrayList<>();
        maxCapacity = capacity;
        vacancies = new ArrayList<>();
        pendingMaintReqs = new ArrayList<>();
        pastMaintReqs = new ArrayList<>();
        pendingAppts = new ArrayList<>();
        pastAppts = new ArrayList<>();
        lastBuildingID = buildingID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String name) {
        buildingName = name;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public ArrayList<Room> getVacancies() {
        return vacancies;
    }

    public void addVacancy(Room room) {
        vacancies.add(room);
    }

    public boolean removeVacancy(int roomID) {
        for (Room r :
                vacancies) {
            if (r.getRoomID() == roomID) {
                vacancies.remove(r);
                return true;
            }
        } return false;
    }

    public ArrayList<MaintRequest> getPendingMaintReqs() {
        return pendingMaintReqs;
    }

    public void addPendingMaintReqs(MaintRequest request) {
        pendingMaintReqs.add(request);        
    }
    
    public boolean removePendingMaintReqs(int requestID) {
        for (MaintRequest r :
                pendingMaintReqs) {
            if (r.getRequestID() == requestID) {
                pendingMaintReqs.remove(r);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<MaintRequest> getPastMaintReqs() {
        return pastMaintReqs;
    }
    
    public void addPastMaintReq(MaintRequest request) {
        pastMaintReqs.add(request);
    }
    
    public boolean removePastMaintReq(int requestID) {
        for (MaintRequest r :
                pastMaintReqs) {
            if (r.getRequestID() == requestID) {
                pastMaintReqs.remove(r);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Appointment> getPendingAppts() {
        return pendingAppts;
    }
    
    public void addPendingAppt(Appointment appointment) {
        pendingAppts.add(appointment);
    }
    
    public boolean removePendingAppt(int appointmentID) {
        for (Appointment a :
                pendingAppts) {
            if (a.getApptID() == appointmentID) {
                pendingAppts.remove(a);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Appointment> getPastAppts() {
        return pastAppts;
    }

    public void addPastAppt(Appointment appointment) {
        pastAppts.add(appointment);
    }

    public boolean removePastAppt(int appointmentID) {
        for (Appointment a :
                pastAppts) {
            if (a.getApptID() == appointmentID) {
                pastAppts.remove(a);
                return true;
            }
        }
        return false;
    }

}
