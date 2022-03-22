package test;

import main.Building;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BuildingTest {

    private Building building;

    @BeforeEach
    void setUp() {
        building = new Building("testBuilding", 100);
    }

    @Test
    void testGetBuildingName() {
        assertEquals("testBuilding", building.getBuildingName());
    }

    @Test
    void testSetBuildingName() {
        building.setBuildingName("newName");
        assertEquals("newName", building.getBuildingName());
    }

    @Test
    void testGetRoomList() {
        assertNotNull(building.getRoomList());
    }

    @Test
    void testGetBuildingID() {
        assertEquals(1, building.getBuildingID());
    }

    @Test
    void testGetMaxCapacity() {
        assertEquals(100, building.getMaxCapacity());
    }

    @Test
    void testGetVacancies() {

    }


}
