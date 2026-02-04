package Strategy;

public class NoDiscountStrategy implements DiscountProcessingStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}
