package com.interview.buysellstock.Model;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Mediator {
    private static StockExchange stockExchange;
    private List<IUser> users = new ArrayList<IUser>();
    private List<IStockQuotation> stocksInTransit = new ArrayList<IStockQuotation>();

    private StockExchange() {
    }

    public static StockExchange getStockExchange(){
        if(stockExchange != null)
            return stockExchange;

        StockExchange.stockExchange = new StockExchange();
        return StockExchange.stockExchange;
    }

    public static void setStockExchangeForMocking(StockExchange stockExchange){
        StockExchange.stockExchange = stockExchange;
    }

    private boolean existingUser(IUser user){
        return users.contains(user);
    }
    public String registerUser(IUser user){
        if(!existingUser(user)){
            users.add(user);
            return String.format("User %s registered to stockExchange \n", ((User)user).getUserName());
        }
        return String.format("User with username %s is already registered \n", ((User)user).getUserName());
    }


    public String unregisterUser(IUser user){
        if(existingUser(user)){
            users.remove(user);
            return String.format("User %s Un-registered from stockExchange \n", ((User)user).getUserName());
        }
        return String.format("User with username %s is not registered \n", ((User)user).getUserName());
    }


    synchronized public void raiseSellingRequest(IStockQuotation request) {
        stocksInTransit.add(request);
        process();
    }

    synchronized public void raiseBuyingRequest(IStockQuotation request) {
        stocksInTransit.add(request);
        process();
    }


    synchronized private void process(){
        // run some logic , sell and purchase stocks and update corresponding users!!
        System.out.println("processing stocks..");
    }


}
