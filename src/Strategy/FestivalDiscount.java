package Strategy;

public class FestivalDiscount implements DiscountProcessingStrategy{
    @Override
    public double applyDiscount(double amount) {
        return 0.90*amount;
    }
}
