package Strategy.Factory;

import Strategy.DiscountProcessingStrategy;
import Strategy.FestivalDiscount;
import Strategy.NoDiscountStrategy;
import Strategy.PremiunDiscount;

public class DefaultDiscountFactory implements DiscountProcessingFactory{
    @Override
    public DiscountProcessingStrategy getDiscount(DiscountType type) {
        switch(type){
            case Festival:return new FestivalDiscount();
            case NoDiscount:return new NoDiscountStrategy();
            case Premium:return new PremiunDiscount();
            default:throw new IllegalArgumentException();
        }
    }
}
