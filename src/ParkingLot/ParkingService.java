package ParkingLot;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ParkingService {

    public Ticket park(Vehicle vehicle,List<ParkingFloor> parkingFloors){
        List<ParkingFloor> parkingFloor=null;
        parkingFloor=parkingFloors.stream().filter(cur ->
             (cur.getSupportedType()).equals(vehicle.getType())
        ).collect(Collectors.toList());
        if(parkingFloor == null) return null;

        ParkingSpot spot = null;
        for(ParkingFloor floor :parkingFloor){
            spot = floor.findSpot();
        }
        if(spot == null) return null;
        spot.park(vehicle);

        return new Ticket(UUID.randomUUID(),spot,vehicle,System.currentTimeMillis());

    }

    public void unPark(Ticket ticket){
        double total =((System.currentTimeMillis() - ticket.getEntryTime())/1000)*ticket.getVehicle().getCharge();
        System.out.println("Making payment of Rupees - "+total);

    }
}
