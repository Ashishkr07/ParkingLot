package Strategy;

public class WalletPaymentStrategy implements PaymentProcessingStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Wallet Payment Successful  for amount - "+amount);
    }
}
