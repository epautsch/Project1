import java.util.ArrayList;
import java.time.LocalTime;

public class Hospital implements Facility, FacilityUse, FacilityMaintenance{
    private ArrayList<Building> buildings;
    private ArrayList<MaintRequest> openMaintReqs;
    private ArrayList<MaintRequest> pastMaintReqs;
    private ArrayList<Room> vacantRooms;
    private ArrayList<Inspection> pastInspections;
    private ArrayList<Inspection> pendingInspections;
    private ArrayList<Appointment> allAppointments;
    private int totalRooms;

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

    public void addOpenMaintRequest(MaintRequest mR) {
        openMaintReqs.add(mR);
    }

    public void removeOpenMaintRequest(MaintRequest mR) {
        openMaintReqs.remove(mR);
    }

    public ArrayList<Building> listFacilities() {
        return buildings;
    }

    public Room getAvailableRoom() {
        if (!vacantRooms.isEmpty()) {
            return vacantRooms.get(0);
        }
        return null;
    }

    public ArrayList<Room> getFacilityInformation(Building building) {
        return building.getVacancies();
    }

    public int requestAvailableCapacity(Building b) {
        return b.getVacancies().size();
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

    public boolean removeFacility(Building b) {
        boolean success = false;
        if(buildings.remove(b)) {
            success = true;
        }
        return success;
    }

    public boolean isInUseDuringInterval(Room r) {
        boolean inUse = false;
        if(r.getPatients().size() > 0) {
            inUse = true;
        }
        return inUse;
    }

    public Room assignFacilityToUse(Appointment a) {
        if (a instanceof PatientAppt) {
            if (vacantRooms.size() > 0) {
                return vacantRooms.get(0);
            }
        }
        else if (a instanceof MaintAppt) {
            return ((MaintAppt) a).getMaintRequest().getRoom();
        }
        return null;
    }

    public boolean vacateFacility(Room r) {
        boolean vacated = false;
        ArrayList<Patient> pList = r.getPatients();
        for (Patient p: pList) {
            r.removePatient(p.getPatientID());
        }
        if (r.getPatients().size() == 0) {
            vacated = true;
        }
        return vacated;
    }

    public ArrayList<Inspection> listInspections() {
        return pendingInspections;
    }

    public ArrayList<Appointment> listActualUsage() {
        return allAppointments;
    }

    public void setNumRooms() {
        int numRooms = 0;
        for (Building b: buildings) {
            numRooms += b.getRoomList().size();
        }
        this.totalRooms = numRooms;
    }

    public float calcUsageRate() {
        float usageRate = 0;
        usageRate = totalRooms / allAppointments.size();
        return usageRate;
    }

    public MaintRequest makeFacilityMaintRequest(ArrayList<Maintenance> mList, Room r, Building b) {
        return new MaintRequest(mList, r, b);
    }

    public MaintAppt scheduleMaintenance(MaintRequest mReq, Building b, Room r, LocalTime t) {
        return new MaintAppt(mReq, b, r, t);
    }

    public float calcMaintenanceCostForFacility() {
        float cost = 0;
        for (MaintRequest mReq: openMaintReqs) {
            cost += mReq.calcRequestCost();
        }
        return cost;
    }

    public float calcProblemRateForFacility() {
        float probNum = openMaintReqs.size() + pastMaintReqs.size();
        float rate = probNum / totalRooms;
        return rate;
    }

    public float calcDownTimeForFacility() {
        float dTime= 0;
        dTime = calcMaintenanceCostForFacility() / calcProblemRateForFacility();
        return dTime;
    }

    public ArrayList<MaintRequest> listMaintRequest() {
        return openMaintReqs;
    }

    public ArrayList<Appointment> listMaintenance() {
        return allAppointments;
    }

    public ArrayList<Inspection> listFacilityProblems() {
        return pendingInspections;
    }
}
