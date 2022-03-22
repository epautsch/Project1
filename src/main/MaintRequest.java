package main;

import main.Building;
import main.MaintAppt;
import main.Maintenance;

import java.util.ArrayList;

public class MaintRequest {
    static int lastRequestID = 0;
    private int requestID;
    private ArrayList<Maintenance> listProblems;
    private Room room;
    private Building building;
    private boolean requestStatus; // true is open, false is closed. Default is true.

    public MaintRequest(ArrayList<Maintenance> maintList, Room r, Building b) {
        requestID = lastRequestID + 1;
        listProblems = maintList;
        room = r;
        building = b;
        requestStatus = true;
        lastRequestID = requestID;
    }

    public int getRequestID() {
        return requestID;
    }

    public ArrayList<Maintenance> getListProblems() {
        return listProblems;
    }

    public int getRoomNumber() {
        return room.getRoomID();
    }

    public Room getRoom() {
        return room;
    }

    public int getBuildingNumber() {
        return building.getBuildingID();
    }

    public boolean getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(boolean status) {
        requestStatus = status;
    }

    public float calcRequestCost() {
        return 0.0f;
    }

}
