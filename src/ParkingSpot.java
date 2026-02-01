public class ParkingSpot {

    private int spotNumber;
    private boolean isFree;

    public ParkingSpot(Vehicle vehicle, int spotNumber, boolean isFree) {
        this.spotNumber = spotNumber;
        this.isFree = isFree;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
