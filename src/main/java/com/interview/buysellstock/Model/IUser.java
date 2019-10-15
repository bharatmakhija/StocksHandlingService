package com.interview.buysellstock.Model;

public interface IUser {

    public void setStockExchangeMediator(Mediator mediator);
    public void receiveMessage(Object message);
}
