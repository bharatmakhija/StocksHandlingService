package com.interview.buysellstock.Model;



public class User implements IUser {

private String userName;
private Mediator mediator;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userName != null ? userName.equals(user.userName) : user.userName == null;
    }

    @Override
    public int hashCode() {
        return userName != null ? userName.hashCode() : 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public void setStockExchangeMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveMessage(Object message) {

    }

    public void raiseSellingRequest(IStockQuotation stockQuotation){
        this.mediator.raiseSellingRequest(stockQuotation);
    }


    public void raiseBuyingRequest(IStockQuotation stockQuotation){
        this.mediator.raiseBuyingRequest(stockQuotation);
    }



}
