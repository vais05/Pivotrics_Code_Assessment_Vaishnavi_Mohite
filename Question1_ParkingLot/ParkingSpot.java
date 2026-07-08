public class ParkingSpot {
    private int spotId;
    private SpotSize size;
    private Vehicle parkedVehicle;
    public ParkingSpot(int spotId, SpotSize size) {
        this.spotId = spotId;
        this.size = size;
    }
    public boolean isAvailable() {
        return parkedVehicle == null;
    }
    public int getSpotId() {
        return spotId;
    }
    public SpotSize getSize() {
        return size;
    }
    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
    public boolean canFitVehicle(Vehicle vehicle) {
        switch (vehicle.getVehicleType()) {
            case MOTORCYCLE:
                return true;
            case CAR:
                return size == SpotSize.MEDIUM || size == SpotSize.LARGE;
            case TRUCK:
                return size == SpotSize.LARGE;
            default:
                return false;
        }
    }
    public boolean parkVehicle(Vehicle vehicle) {
        if (isAvailable() && canFitVehicle(vehicle)) {
            parkedVehicle = vehicle;
            return true;
        }
        return false;
    }
    public void removeVehicle() {
        parkedVehicle = null;
    }
}