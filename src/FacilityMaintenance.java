import java.util.ArrayList;

public interface FacilityMaintenance {
    public MaintRequest makeFacilityMaintRequest();
    public MaintAppt scheduleMaintenance();
    public float calcMaintenanceCostForFacility();
    public float calcProblemRateForFacility();
    public float calcDownTimeForFacility();
    public ArrayList<MaintRequest> listMaintRequest();
    public ArrayList<MaintAppt> listMaintenance();
    public ArrayList<Maintenance> listFacilityProblems();
}
