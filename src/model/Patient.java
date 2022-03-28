package model;

public class Patient {
    private int patientID;
    private int previousPatientID = 0;

    public Patient() {
        patientID = previousPatientID + 1;
        previousPatientID = patientID;
    }

    public int getPatientID() {
        return patientID;
    }
}
