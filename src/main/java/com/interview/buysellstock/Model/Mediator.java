package com.interview.buysellstock.Model;

public interface Mediator {

    public void raiseSellingRequest(IStockQuotation request);
    public void raiseBuyingRequest(IStockQuotation request);
}
