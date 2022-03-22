package main;

public class Maintenance {
    private int maintenanceType;
    private float maintenanceCost;

    public Maintenance(int type) {
        maintenanceType = type;
        maintenanceCost = 0.0f;
    }

    public int getMaintenanceType() {
        return maintenanceType;
    }

    public float getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(float cost) {
        maintenanceCost = cost;
    }

}
