public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(new ParkingSpot(1, SpotSize.SMALL));
        parkingLot.addParkingSpot(new ParkingSpot(2, SpotSize.MEDIUM));
        parkingLot.addParkingSpot(new ParkingSpot(3, SpotSize.LARGE));
        parkingLot.addParkingSpot(new ParkingSpot(4, SpotSize.LARGE));
        Vehicle bike = new Motorcycle("MH12AB1111");
        Vehicle car = new Car("MH12CD2222");
        Vehicle truck = new Truck("MH12EF3333");
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.displayAvailableSpots();
        parkingLot.removeVehicle("MH12CD2222");
        parkingLot.displayAvailableSpots();
    }
}