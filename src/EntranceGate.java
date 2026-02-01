import java.util.UUID;

public class EntranceGate implements Gate{

    public Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle){
       return new Ticket(UUID.randomUUID(),parkingSpot,vehicle, System.currentTimeMillis());
    }
}
