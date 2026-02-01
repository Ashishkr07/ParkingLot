public class Vehicle {

    private String type;
    private double charge;

    public Vehicle(String type, double charge) {
        this.type = type;
        this.charge = charge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
