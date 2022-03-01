import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class MaintAppt {
    static int lastApptID;
    private int maintApptID;
    private ArrayList<Employee> employeeList;
    private MaintRequest maintRequest;
    private Building apptBuilding;
    private Room apptRoom;
    private LocalTime apptStartTime;

    public MaintAppt(MaintRequest request, Building building, Room room) {
        maintApptID = lastApptID + 1;
        lastApptID += 1;
        employeeList = new ArrayList<>();
        maintRequest = request;
        apptBuilding = building;
        apptRoom = room;
        apptStartTime = LocalTime.now();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public boolean removeEmployee(int employeeID) {
        for (Employee e :
                employeeList) {
            if (e.getEmployeeID() == employeeID) {
                employeeList.remove(e);
                return true;
            }
        }
        return false;
    }

    public Building getApptBuilding() {
        return apptBuilding;
    }

    public Room getApptRoom() {
        return apptRoom;
    }

    public MaintRequest getMaintRequest() {
        return maintRequest;
    }

    public LocalTime getApptStartTime() {
        return apptStartTime;
    }

    public Duration getApptDuration() {
        return Duration.between(apptStartTime, LocalTime.now());
    }
}
