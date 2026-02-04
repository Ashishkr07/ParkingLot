package Strategy;

import Strategy.Factory.DiscountProcessingFactory;
import Strategy.Factory.DiscountType;
import Strategy.Factory.PaymentProcessingFactory;
import Strategy.Factory.PaymentType;

public class PaymentProcessor {

    private PaymentProcessingFactory paymentProcessingFactory;
    private DiscountProcessingFactory discountProcessingFactory;

    public PaymentProcessor(PaymentProcessingFactory paymentProcessingFactory, DiscountProcessingFactory discountProcessingFactory) {
        this.paymentProcessingFactory = paymentProcessingFactory;
        this.discountProcessingFactory = discountProcessingFactory;
    }


    public  void applyDiscountAndPay(DiscountType type,PaymentType paymentType,double amount){
         DiscountProcessingStrategy discountProcessingStrategy = discountProcessingFactory.getDiscount(type);
         PaymentProcessingStrategy strategy = paymentProcessingFactory.getFactory(paymentType);
         strategy.pay(discountProcessingStrategy.applyDiscount(amount));
    }

}
