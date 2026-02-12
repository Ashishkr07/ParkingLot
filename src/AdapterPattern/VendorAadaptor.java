package AdapterPattern;

public class VendorAadaptor implements PaymentProcessor{

    VendorA vendorA;

    public VendorAadaptor(VendorA vendorA) {
        this.vendorA = vendorA;
    }

    @Override
    public void pay(double amount) {
        vendorA.makePayment(amount);
    }
}
