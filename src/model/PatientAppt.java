package model;

import java.time.LocalTime;

public class PatientAppt extends Appointment {
    private Patient patient;
    private String apptDetails;

    public PatientAppt(Building building, Room room, LocalTime startTime, Patient p) {
        super(building, room, startTime);
        patient = p;
        apptDetails = "";
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient p) {
        patient = p;
    }

    public String getApptDetails() {
        return apptDetails;
    }

    public void setApptDetails(String details) {
        apptDetails = details;
    }
}
