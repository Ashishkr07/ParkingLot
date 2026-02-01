import java.util.List;

public class SpotManager {
    List<ParkingLevel> parkingLevels;

    public SpotManager(List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle){
        ParkingSpot spot = null;
        for (ParkingLevel cur:parkingLevels){
            if((vehicle.getType()).equals(cur.getVehicle().getType())){
                 spot = cur.getParkingSpotList().stream()
                        .filter(curSpot -> curSpot.isFree()).findFirst().orElse(null);
                }
            }
         return spot;
        }

}


