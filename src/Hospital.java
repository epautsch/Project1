import java.util.ArrayList;

public class Hospital implements Facility{

    public ArrayList<Building> buildingsOnCampus;
    public ArrayList<Department> departments;

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

    public Building addNewFacility(String name) {
        return new Building();
    }

    public void addFacilityDetail() {

    }

    public ArrayList<String> removeFavility() {
        ArrayList<String> temp = new ArrayList<>();
        return temp;
    }


}
