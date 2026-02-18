package StateDesignPattern;

import java.util.Map;

public class NoCoin implements State {

    @Override
    public void insert(double amount, VendingMachinService vendingMachinService) {
        vendingMachinService.setCurState(new HasCoin());
    }

    @Override
    public void select(Items items, VendingMachinService vendingMachinService) {

    }

    @Override
    public void refund(double amount, VendingMachinService vendingMachinService) {

    }

    @Override
    public void dispense(Items items, Map<Items, Integer> itemlist, VendingMachinService vendingMachinService) {

    }
}
