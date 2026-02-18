package StateDesignPattern;

import java.util.Map;

public class VendingMachinService {

    State curState;
    Map<Items,Integer> itemlist;

    public VendingMachinService(State curState,Map<Items,Integer> itemlist) {
        this.curState = curState;
        this.itemlist = itemlist;
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }

    public void insertCoin(double amount){
     curState.insert(amount,this);
    }

    public void selectItem(Items items){
       curState.select(items,this);
    }

    public void dispense(Items items){
        curState.dispense(items,itemlist,this);
    }

    public void refundMoney(double amount){
        curState.refund(amount,this);
    }
}
