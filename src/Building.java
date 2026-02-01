

public class Building {
    private ParkingController parkingController;

    public Building(ParkingController parkingController) {
        this.parkingController = parkingController;
    }

    public Ticket vehicleComing(){
        return parkingController.parkVehicle();
    }

    public void vehicleGoing(Ticket ticket){
       parkingController.vehicleLeaving(ticket);
    }
}
