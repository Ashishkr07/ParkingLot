package ParkingLot;

import java.util.List;

public class ParkingFloor {

    List<ParkingSpot> parkingSpots;
    VehicleType supportedType;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public VehicleType getSupportedType() {
        return supportedType;
    }

    public void setSupportedType(VehicleType supportedType) {
        this.supportedType = supportedType;
    }

    public ParkingSpot findSpot(){
        for(ParkingSpot cur : parkingSpots){
            if(cur.isFree())return cur;
        }
        return null;
    }

}
