package Stock_Price_Alert_System;

public class SmsAlert implements Observer{

    @Override
    public void update(Stock stock) {
        System.out.println("Updated stock price of stock in sms with price -"+stock.getSymbol()+"  "+stock.getPrice());
    }
}
