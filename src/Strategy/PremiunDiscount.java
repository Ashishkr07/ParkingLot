package Strategy;

public class PremiunDiscount implements  DiscountProcessingStrategy{
    @Override
    public double applyDiscount(double amount) {
        return 0.80*amount;
    }
}
