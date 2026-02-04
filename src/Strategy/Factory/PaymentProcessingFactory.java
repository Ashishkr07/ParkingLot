package Strategy.Factory;

import Strategy.PaymentProcessingStrategy;

public interface PaymentProcessingFactory {

      PaymentProcessingStrategy getFactory(PaymentType type);
}
