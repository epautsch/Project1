import java.util.ArrayList;

public interface FacilityUse {
    public boolean isInUseDuringInterval();
    public Room assignFacilityToUse();
    public Room vacateFacility();
    public ArrayList<Inspection> listInspections();
    public void listActualUsage();
    public float calcUsageRate();
}
