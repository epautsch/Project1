import java.util.ArrayList;

public interface Facility {
    public ArrayList<Building> listFacilities();
    public ArrayList<Room> getFacilityInformation(Building bldng);
    public int requestAvailableCapacity(Building bldng);
    public boolean addNewFacility(Building bldng);
    public boolean addFacilityDetail(String detail);
    public boolean removeFacility(Building bldng);
    public void setNumRooms();
    public void addOpenMaintRequest(MaintRequest mR);
    public void removeOpenMaintRequest(MaintRequest mR);
}
