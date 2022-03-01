import java.util.ArrayList;

public class Building implements  FacilityUse{
    public String name;
    public int numFloors;
    public int roomsPerFloor;
    public int maxPatientCapacity;
    public ArrayList<Room> currentVacancies;

    public boolean isInUseDuringInterval() {
        return false;
    }

    public Room assignFacilityToUse(String facility) {
        return new Room();
    }

    public Room vacateFacility(String facility) {
        return new Room();
    }

    public ArrayList<Inspection> listInspections() {
        return new ArrayList<Inspection>();
    }

    public void listActualUsage() {

    }

    public float calcUsageRate() {
        return 0.0f;
    }

}
