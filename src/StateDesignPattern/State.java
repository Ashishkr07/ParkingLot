package StateDesignPattern;

import java.util.Map;

public interface State {


    void insert(double amount, VendingMachinService vendingMachinService);
    void select(Items items, VendingMachinService vendingMachinService);
    public void refund(double amount, VendingMachinService vendingMachinService);
    public void dispense(Items items, Map<Items, Integer> itemlist, VendingMachinService vendingMachinService);

}
