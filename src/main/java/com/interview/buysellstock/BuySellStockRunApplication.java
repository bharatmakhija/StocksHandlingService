package com.interview.buysellstock;

import com.interview.buysellstock.Client.Client;
import com.interview.buysellstock.Controller.BasicClientCommandController;
import com.interview.buysellstock.Controller.ClientCommandController;
import com.interview.buysellstock.Model.StockExchange;
import com.interview.buysellstock.service.ClientHandlerService;
import com.interview.buysellstock.service.BaseStockExchangeService;
import com.interview.buysellstock.service.StockExchangeService;

import java.io.IOException;
import java.io.PrintStream;

public class BuySellStockRunApplication {

    public static BuySellStockRunApplication buySellStockRunApplication;


    public static BuySellStockRunApplication getApp(){
        if(BuySellStockRunApplication.buySellStockRunApplication != null)
            return BuySellStockRunApplication.buySellStockRunApplication;

        BuySellStockRunApplication.buySellStockRunApplication = new BuySellStockRunApplication();
        return BuySellStockRunApplication.buySellStockRunApplication;
    }

    public static void setApp(BuySellStockRunApplication application){
        BuySellStockRunApplication.buySellStockRunApplication = application;
    }

    public void start(String[] args) throws IOException {
        System.out.println("Starting BuySellApplication...");
        ClientHandlerService clientHandlerService = new ClientHandlerService();
        Client client = clientHandlerService.getClient(args);
        ClientCommandController clientCommandController = new BasicClientCommandController();
        StockExchangeService stockExchangeService = new BaseStockExchangeService(StockExchange.getStockExchange());
        clientCommandController.registerBaseService(stockExchangeService);
        client.registerService(clientCommandController);
        PrintStream ps = new PrintStream(System.out);
        client.run(ps);
    }

    public static void main(String[] args) throws IOException {
        if(BuySellStockRunApplication.buySellStockRunApplication == null){
            BuySellStockRunApplication.getApp();
        }
        buySellStockRunApplication.start(args);
    }
}
