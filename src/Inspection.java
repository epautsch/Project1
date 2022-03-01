import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Inspection {
    static int lastInspectionID;
    private int inspectionID;
    private LocalTime inspectionStartTime;
    private ArrayList<Building> listBuildingsInspected;
    private boolean inspectionPass;

    public Inspection(ArrayList<Building> buildings) {
        inspectionID = lastInspectionID + 1;
        lastInspectionID += 1;
        inspectionStartTime = LocalTime.now();
        listBuildingsInspected = buildings;
        inspectionPass = false;
    }

    public int getInspectionID() {
        return inspectionID;
    }

    public Duration getInspectionDuration() {
        return Duration.between(inspectionStartTime, LocalTime.now());
    }

    public ArrayList<Building> getListBuildingsInspected() {
        return listBuildingsInspected;
    }

    public void addBuildingInspected(Building building) {
        listBuildingsInspected.add(building);
    }

    public boolean removeBuildingInspected(int buildingID) {
        for (Building b :
                listBuildingsInspected) {
            if (b.getBuildingID() == buildingID) {
                listBuildingsInspected.remove(b);
                return true;
            }
        }
        return false;
    }

    public boolean getInspectionPass() {
        return inspectionPass;
    }

    public void setInspectionPass(boolean status) {
        inspectionPass = status;
    }
}
