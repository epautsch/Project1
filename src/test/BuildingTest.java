package test;

import static
org.junit.jupiter.api.Assertions.assertEquals;

import main.Building;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}
