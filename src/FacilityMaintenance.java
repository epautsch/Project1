import java.time.LocalTime;
import java.util.ArrayList;

public interface FacilityMaintenance {
    public MaintRequest makeFacilityMaintRequest(ArrayList<Maintenance> mList, Room r, Building b);
    public MaintAppt scheduleMaintenance(MaintRequest mReq, Building b, Room r, LocalTime t);
    public float calcMaintenanceCostForFacility();
    public float calcProblemRateForFacility();
    public float calcDownTimeForFacility();
    public ArrayList<MaintRequest> listMaintRequest();
    public ArrayList<Appointment> listMaintenance();
    public ArrayList<Inspection> listFacilityProblems();
}
