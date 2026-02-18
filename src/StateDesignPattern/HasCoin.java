package StateDesignPattern;

import java.util.Map;

public class HasCoin implements State{

    @Override
    public void insert(double amount, VendingMachinService vendingMachinService) {
    }

    @Override
    public void select(Items items, VendingMachinService vendingMachinService) {
        vendingMachinService.setCurState(new DispensingState());
    }

    @Override
    public void refund(double amount, VendingMachinService vendingMachinService) {

    }

    @Override
    public void dispense(Items items, Map<Items, Integer> itemlist, VendingMachinService vendingMachinService) {

    }
}
