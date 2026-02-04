package Strategy.Factory;

import Strategy.DiscountProcessingStrategy;

public interface DiscountProcessingFactory {

    DiscountProcessingStrategy getDiscount(DiscountType type);
}
