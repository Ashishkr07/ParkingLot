package AdapterPattern;

public class VendorBAdaptor implements PaymentProcessor{

    VendorB vendorB;

    public VendorBAdaptor(VendorB vendorB) {
        this.vendorB = vendorB;
    }

    @Override
    public void pay(double amount) {
        vendorB.payInCents((long) amount);
    }
}
