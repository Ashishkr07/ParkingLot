package ParkingLot;

import java.util.List;

public class ParkingLot {

    List<ParkingFloor> parkingFloors;
    ParkingService parkingService = new ParkingService();

    public ParkingLot(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public Ticket findSpot(Vehicle vehicle){
        return parkingService.park(vehicle,parkingFloors);
    }

    public void unPark(Ticket ticket){
        parkingService.unPark(ticket);
        ticket.getParkingSpot().unPark();
    }

}
