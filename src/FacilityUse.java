import java.util.ArrayList;

public interface FacilityUse {
    public boolean isInUseDuringInterval(Room r);
    public Room assignFacilityToUse(Appointment a);
    public boolean vacateFacility(Room r);
    public ArrayList<Inspection> listInspections();
    public ArrayList<Appointment> listActualUsage();
    public float calcUsageRate();
}
