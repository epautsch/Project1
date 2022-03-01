import java.util.ArrayList;

public class Hospital implements Facility, FacilityUse, FacilityMaintenance{

    public ArrayList<String> listFacilities() {
        return null;
    }

    public String getFacilityInformation(Building building) {
        return null;
    }

    public int requestAvailableCapacity(Building building) {
        return 0;
    }

    public boolean addNewFacility(Building bldng) {
        return false;
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
        return null;
    }

    public ArrayList<MaintAppt> listMaintenance() {
        return null;
    }

    public ArrayList<Maintenance> listFacilityProblems() {
        return null;
    }
}
