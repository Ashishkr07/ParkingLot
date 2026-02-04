package ParkingLot;

public class ParkingSpot {

    private int spotNumber;
    private Vehicle vehicle;

    public ParkingSpot(Vehicle vehicle, int spotNumber) {
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
    }

    public boolean isFree() {
        return vehicle == null;
    }

    public void park(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void unPark(){
        this.vehicle = null;
    }

}
