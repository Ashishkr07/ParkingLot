import java.util.List;

public class ParkingLevel {

    private List<ParkingSpot> parkingSpotList;
    private Vehicle vehicle;

    public ParkingLevel(List<ParkingSpot> parkingSpotList, Vehicle vehicle) {
        this.parkingSpotList = parkingSpotList;
        this.vehicle = vehicle;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
