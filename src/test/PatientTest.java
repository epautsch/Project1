package test;

import main.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {
    private Patient patient;

    @BeforeEach
    void setUp() {
        patient = new Patient();
    }

    @Test
    void testGetPatientID() {
        assertEquals(1, patient.getPatientID());
    }

}
