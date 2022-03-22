package main;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Appointment {
    static int lastApptID;
    private int apptID;
    private ArrayList<Employee> employeeList;
    private Building apptBuilding;
    private Room apptRoom;
    private LocalTime apptStartTime;

    public Appointment(Building building, Room room, LocalTime startTime) {
        apptID = lastApptID + 1;
        lastApptID += 1;
        employeeList = new ArrayList<>();
        apptBuilding = building;
        apptRoom = room;
        apptStartTime = startTime;
    }

    public int getApptID() {
        return apptID;
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

    public LocalTime getApptStartTime() {
        return apptStartTime;
    }

    public Duration getApptDuration() {
        return Duration.between(apptStartTime, LocalTime.now());
    }
}
