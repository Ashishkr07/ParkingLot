package Stock_Price_Alert_System;

import java.util.List;

public class Stock implements Subject{

    List<Observer> observerList;
    String symbol;
    double price;

    public Stock(List<Observer> observerList, String symbol, double price) {
        this.observerList = observerList;
        this.symbol = symbol;
        this.price = price;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        for(Observer cur: observerList){
            cur.update(this);
        }
    }

    @Override
    public void register(Observer newObserver) {
        observerList.add(newObserver);
        System.out.println("New Observer added -" +newObserver);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
        System.out.println("Observer removed -" +observer);

    }


}
