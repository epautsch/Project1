import java.util.ArrayList;

public class Hospital implements Facility{

    public ArrayList<String> listFacilities() {
        ArrayList<String> temp = new ArrayList<>();
        return temp;
    }

    public String getFacilityInformation(Building building) {
        return "";
    }

    public int requestAvailableCapacity(Building building) {
        return -1;
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


}
