package com.interview.buysellstock;

public class BuySellStockRunApplication {

    public static BuySellStockRunApplication buySellStockRunApplication;


    public static BuySellStockRunApplication getApp() throws Exception{
        if(BuySellStockRunApplication.buySellStockRunApplication != null)
            return BuySellStockRunApplication.buySellStockRunApplication;

        BuySellStockRunApplication.buySellStockRunApplication = new BuySellStockRunApplication();
        return BuySellStockRunApplication.buySellStockRunApplication;
    }

    public static void setApp(BuySellStockRunApplication application){
        BuySellStockRunApplication.buySellStockRunApplication = application;
    }

    public void start(){
        System.out.println("Starting BuySellApplication...");
    }

    public static void main(String[] args) {
        buySellStockRunApplication.start();
    }
}
