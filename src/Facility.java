import java.util.ArrayList;

public interface Facility {
    public ArrayList<String> listFacilities();
    public String getFacilityInformation(Building bldng);
    public int requestAvailableCapacity(Building bldng);
    public boolean addNewFacility(Building bldng);
    public boolean addFacilityDetail(String detail);
    public boolean removeFacility(Building bldng);
}
