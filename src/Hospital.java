import java.util.ArrayList;
import java.util.

public class Hospital implements Facility, FacilityUse, FacilityMaintenance{
    private ArrayList<Building> buildings;
    private ArrayList<MaintRequest> openMaintReqs;
    private ArrayList<MaintRequest> pastMaintReqs;
    private ArrayList<Room> vacantRooms;
    private ArrayList<Inspection> pastInspections;
    private ArrayList<Inspection> pendingInspections;
    private ArrayList<Appointment> allAppointments;

    public Hospital() {
        this.buildings = new ArrayList<>();
        this.openMaintReqs = new ArrayList<>();
        this.pastMaintReqs = new ArrayList<>();
        this.vacantRooms = new ArrayList<>();
        this.pastInspections = new ArrayList<>();
        this.pendingInspections = new ArrayList<>();
        this.allAppointments = new ArrayList<>();
    }

    public Hospital(ArrayList<Building> list) {
        this.buildings = list;
        this.openMaintReqs = new ArrayList<>();
        this.pastMaintReqs = new ArrayList<>();
        this.vacantRooms = new ArrayList<>();
        this.pastInspections = new ArrayList<>();
        this.pendingInspections = new ArrayList<>();
        this.allAppointments = new ArrayList<>();
    }

    public boolean addOpenMaintRequest(MaintRequest mR) {
        openMaintReqs.add(mR);
    }

    public void removeOpenMaintRequest(MaintRequest mR) {
        openMaintReqs.remove( mR);
    }

    public ArrayList<Building> listFacilities() {
        return buildings;
    }

    public ArrayList<Room> getFacilityInformation(Building building) {
        return building.getVacancies();
    }

    public int requestAvailableCapacity(Building building) {
        return building.getVacancies().size();
    }

    public boolean addNewFacility(Building newB) {
        boolean success = false;
        if (buildings.add(newB)) {
            success = true;
        }
        return success;
    }

    public boolean addFacilityDetail(String detail) {
        return false;
    }

    public boolean removeFacility(Building bldng) {
        return false;
    }

    public boolean isInUseDuringInterval() {
        return false;
    }

    public Room assignFacilityToUse() {
        return null;
    }

    public Room vacateFacility() {
        return null;
    }

    public ArrayList<Inspection> listInspections() {
        return null;
    }

    public void listActualUsage() {

    }

    public float calcUsageRate() {
        return 0;
    }

    public MaintRequest makeFacilityMaintRequest() {
        return null;
    }

    public MaintAppt scheduleMaintenance() {
        return null;
    }

    public float calcMaintenanceCostForFacility() {
        return 0;
    }

    public float calcProblemRateForFacility() {
        return 0;
    }

    public float calcDownTimeForFacility() {
        return 0;
    }

    public ArrayList<MaintRequest> listMaintRequest() {
        return openMaintReqs;
    }

    public ArrayList<MaintAppt> listMaintenance() {
        return null;
    }

    public ArrayList<Maintenance> listFacilityProblems() {
        return null;
    }
}
