package com.interview.buysellstock.service;

import com.interview.buysellstock.Model.StockExchange;
import com.interview.buysellstock.Model.User;
import com.interview.buysellstock.factory.UserFactory;

public class BaseStockExchangeService implements StockExchangeService {

    private final StockExchange stockExchange;

    public BaseStockExchangeService(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
    }

    public User createUser(String name){
        User user = UserFactory.getUserWithStockExchangeMediator(this.stockExchange,name);
        this.stockExchange.registerUser(user);
        return user;
    }
}
