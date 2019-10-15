package com.interview.buysellstock.Controller;

import com.interview.buysellstock.service.StockExchangeService;

public interface ClientCommandController {

    public void registerBaseService(StockExchangeService service);
    public Object takeAction(Object object);
}
