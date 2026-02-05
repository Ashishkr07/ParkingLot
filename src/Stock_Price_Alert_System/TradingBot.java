package Stock_Price_Alert_System;

public class TradingBot implements Observer{

    @Override
    public void update(Stock stock) {
        System.out.println("Updated stock price of stock in tradingBot with price -"+stock.getSymbol()+"  "+stock.getPrice());
    }
}
