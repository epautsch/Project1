package test;

import main.Equipment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipmentTest {

    Equipment equip = new Equipment();

    @Test
    void testGetEquipID() {
        assertEquals(1, equip.getEquipID());
    }

}
