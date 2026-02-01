public class ParkingController {
    Vehicle vehicle;
    SpotManager spotManager;
    EntranceGate entranceGate = new EntranceGate();
    ExitGate exitGate = new ExitGate();

    public ParkingController(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket parkVehicle() {
        ParkingSpot parkingSpot = spotManager.getParkingSpot(vehicle);
        Ticket ticket = entranceGate.generateTicket(parkingSpot,vehicle);
        return ticket;
    }

    public void vehicleLeaving(Ticket ticket){
        exitGate.makePayment(ticket);
        exitGate.freeParkingSpot(ticket.getParkingSpot());
    }
}
