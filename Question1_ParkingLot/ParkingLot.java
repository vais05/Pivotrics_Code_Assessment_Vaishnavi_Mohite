import java.util.ArrayList;
import java.util.List;
public class ParkingLot {
    private List<ParkingSpot> parkingSpots;
    public ParkingLot() {
        parkingSpots = new ArrayList<>();
    }
    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }
    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.parkVehicle(vehicle)) {
                System.out.println(
                        vehicle.getVehicleType() +
                        " parked at Spot " +
                        spot.getSpotId());
                return true;
            }
        }
        System.out.println("No suitable parking spot available.");
        return false;
    }
    public boolean removeVehicle(String licensePlate) {
        for (ParkingSpot spot : parkingSpots) {
            Vehicle vehicle = spot.getParkedVehicle();
            if (vehicle != null &&
                    vehicle.getLicensePlate().equals(licensePlate)) {
                spot.removeVehicle();
                System.out.println("Vehicle removed successfully.");
                return true;
            }
        }
        System.out.println("Vehicle not found.");
        return false;
    }
    public void displayAvailableSpots() {
        System.out.println("\nAvailable Parking Spots:");
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) {
                System.out.println(
                        "Spot " +
                        spot.getSpotId() +
                        " (" +
                        spot.getSize() +
                        ")");
            }
        }
    }
}