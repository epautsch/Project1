package test;

import model.Physician;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhysicianTest {
    private Physician physician;

    @BeforeEach
    void setUp() {
        physician = new Physician("Jerry");
    }

    @Test
    void testGetPreviousPatients() {
       assertNotNull(physician.getPreviousPatients());
    }

    @Test
    void testGetActivePatients() {
        assertNotNull(physician.getActivePatients());
    }

}
