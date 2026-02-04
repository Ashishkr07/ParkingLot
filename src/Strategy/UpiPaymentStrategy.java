package Strategy;

public class UpiPaymentStrategy implements PaymentProcessingStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment successful for amount - "+amount);
    }
}
