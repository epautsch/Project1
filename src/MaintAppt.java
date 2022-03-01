import java.time.LocalTime;
import java.util.ArrayList;

public class MaintAppt extends Appointment {
    private ArrayList<Maintenance> listMaintenance;
    private MaintRequest maintRequest;

    public MaintAppt(MaintRequest requst, Building building, Room room, LocalTime startTime) {
        super(building, room, startTime);
        listMaintenance = new ArrayList<>();
        maintRequest = requst;
    }
    
    public ArrayList<Maintenance> getListMaintenance() {
        return listMaintenance;
    }
    
    public void addMaintenance(Maintenance maintenance) {
        listMaintenance.add(maintenance);
    }
    
    public boolean removeMaintenance(int maintenanceType) {
        for (Maintenance m :
                listMaintenance) {
            if (m.getMaintenanceType() == maintenanceType) {
                listMaintenance.remove(m);
                return true;
            }
        }
        return false;
    }

    public MaintRequest getMaintRequest() {
        return maintRequest;
    }

}