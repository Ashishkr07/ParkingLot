package ParkingLot;

public class Truck implements Vehicle{

    private VehicleType type;
    private double charge;

    public Truck(VehicleType type, double charge) {
        this.type = type;
        this.charge = charge;
    }

    @Override
    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
