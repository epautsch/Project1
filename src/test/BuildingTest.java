package test;

import com.sun.tools.javac.Main;
import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.time.LocalTime;

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
        assertNotNull(building.getVacancies());
    }

    @Test
    void testAddVacancy() {
        Room newRoom = new Room(building, 2);
        building.addVacancy(newRoom);
        assertEquals(newRoom, building.getVacancies().get(0));
    }

    @Test
    void testRemoveVacancy() {
        Room newRoom = new Room(building, 2);
        building.addVacancy(newRoom);
        building.removeVacancy(1);
        assertNull(building.getVacancies().get(0));
    }

    @Test
    void testGetPendingMaintReqs() {
        assertNotNull(building.getPendingMaintReqs());
    }

    @Test
    void testRemovePendingMaintReqs() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        building.addPendingMaintReqs(maintreq);
        assertNotNull(building.removePendingMaintReqs(1));
    }

    @Test
    void testGetPastMaintReqs() {
        assertNotNull(building.getPastMaintReqs());
    }

    @Test
    void testAddPastMaintReq() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        building.addPastMaintReq(maintreq);
        assertNotNull(building.getPastMaintReqs().get(0));
    }

    @Test
    void testRemovePastMaintReq() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        building.removePastMaintReq(1);
        assertNull(building.getPastMaintReqs().get(0));
    }

    @Test
    void testGetPendingAppts() {
        assertNotNull(building.getPendingAppts());
    }

    @Test
    void testAddPendingAppt() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        LocalTime time = LocalTime.now();
        MaintAppt newAppt = new MaintAppt(maintreq, building, newRoom, time);
        building.addPendingAppt(newAppt);
        assertNotNull(building.getPendingAppts().get(0));
    }

    @Test
    void testRemovePendingAppt() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        LocalTime time = LocalTime.now();
        MaintAppt newAppt = new MaintAppt(maintreq, building, newRoom, time);
        building.addPendingAppt(newAppt);
        building.removePendingAppt(1);
        assertNull(building.getPendingAppts().get(0));
    }

    @Test
    void testGetPastAppts() {
        assertNotNull(building.getPastAppts());
    }

    @Test
    void testAddPastAppt() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        LocalTime time = LocalTime.now();
        MaintAppt newPastAppt = new MaintAppt(maintreq, building, newRoom, time);
        building.addPastAppt(newPastAppt);
        assertNotNull(building.getPastAppts().get(0));
    }

    @Test
    void testRemovePastAppt() {
        Room newRoom = new Room(building, 2);
        ArrayList<Maintenance> maintList = new ArrayList<>();
        MaintRequest maintreq = new MaintRequest(maintList, newRoom, building);
        LocalTime time = LocalTime.now();
        MaintAppt newPastAppt = new MaintAppt(maintreq, building, newRoom, time);
        building.addPastAppt(newPastAppt);
        building.removePastAppt(1);
        assertNull(building.getPastAppts().get(0));
    }




}
