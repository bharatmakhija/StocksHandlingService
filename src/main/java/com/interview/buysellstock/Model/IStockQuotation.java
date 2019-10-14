package com.interview.buysellstock.Model;

import com.interview.buysellstock.Enums.StockPurpose;

public interface IStockQuotation {

    public void setStockName(String name);
    public void setNumberOfStocks(int numberOfStocks);
    public void setSingleStockPrice(double price);
    public void setToSellOrToPurchase(StockPurpose purpose);
    public void setOwner(IUser user);
}
