package com.interview.buysellstock.Model;

import com.interview.buysellstock.Enums.StockPurpose;

public class StockQuotation implements IStockQuotation {

    private String name;
    private Integer numberOfStocks;
    private Double price;
    private StockPurpose purpose;
    private User user;
    public void setStockName(String name) {
        this.name = name;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public void setSingleStockPrice(double price) {
        this.price = price;
    }

    public void setToSellOrToPurchase(StockPurpose purpose) {
        this.purpose = purpose;
    }

    public void setOwner(IUser user) {
        this.user = (User)user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockQuotation that = (StockQuotation) o;

        if (!name.equals(that.name)) return false;
        if (!numberOfStocks.equals(that.numberOfStocks)) return false;
        if (!price.equals(that.price)) return false;
        if (purpose != that.purpose) return false;
        return user.equals(that.user);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + numberOfStocks.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + purpose.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

}
