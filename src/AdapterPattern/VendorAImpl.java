package AdapterPattern;

public class VendorAImpl implements VendorA{
    @Override
    public void makePayment(double amount) {
        System.out.println("Vendor A payment");
    }
}
