package Strategy.Factory;

import Strategy.CardPaymentStrategy;
import Strategy.PaymentProcessingStrategy;
import Strategy.UpiPaymentStrategy;
import Strategy.WalletPaymentStrategy;

public class DefaultPaymentFactory implements PaymentProcessingFactory{

    @Override
    public PaymentProcessingStrategy getFactory(PaymentType type) {
        switch (type){
            case CARD :
                return new CardPaymentStrategy();
            case UPI :
                return new UpiPaymentStrategy();
            case WALLET :
                return new WalletPaymentStrategy();
            default: throw new IllegalArgumentException();
        }
    }
}
