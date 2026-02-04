package Strategy;

public class CardPaymentStrategy implements PaymentProcessingStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Card Payment Succesfull for amount - "+amount);
    }
}
