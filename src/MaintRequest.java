import java.util.ArrayList;

public class MaintRequest {
    static int lastRequest;
    private int requestNumber;
    private ArrayList<Maintenance> listProblems;
    private Room room;
    private Building building;
    private boolean requestStatus; // true is open, false is closed. Default is true.

    public MaintRequest(ArrayList<Maintenance> maintList, Room r, Building b) {
        requestNumber = lastRequest + 1;
        lastRequest += 1;
        listProblems = maintList;
        room = r;
        building = b;
        requestStatus = true;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public ArrayList<Maintenance> getListProblems() {
        return listProblems;
    }

    public int getRoomNumber() {
        return room.getRoomNumber();
    }

    public int getBuildingNumber() {
        return building.getBuildingNumber();
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
