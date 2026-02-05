package Stock_Price_Alert_System;

public class EmailAlert implements Observer{
    @Override
    public void update(Stock stock) {
        System.out.println("Updated stock price of stock in email with price -"+stock.getSymbol()+"  "+stock.getPrice());
    }
}
