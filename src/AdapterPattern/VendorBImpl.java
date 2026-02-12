package AdapterPattern;

public class VendorBImpl implements VendorB{
    @Override
    public void payInCents(long cents) {
        System.out.println("Vendor B payment");
    }
}
