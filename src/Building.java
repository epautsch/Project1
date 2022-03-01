import java.util.ArrayList;

public class Building implements FacilityUse{
    public String name;
    public int numFloors;
    public int roomsPerFloor;
    public int maxPatientCapacity;
    public ArrayList<Room> currentVacancies;

    public boolean isInUseDuringInterval() {
        return false;
    }

    public Room assignFacilityToUse() {
        return null;
    }

    public Room vacateFacility() {
        return null;
    }

    public Room assignFacilityToUse(String facility) {
        return null;
    }

    public Room vacateFacility(String facility) {
        return null;
    }

    public ArrayList<Inspection> listInspections() {
        return null;
    }

    public void listActualUsage() {

    }

    public float calcUsageRate() {
        return -0.01f;
    }

}
