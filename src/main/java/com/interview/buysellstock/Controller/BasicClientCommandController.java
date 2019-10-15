package com.interview.buysellstock.Controller;

import com.interview.buysellstock.Model.User;
import com.interview.buysellstock.service.BaseStockExchangeService;
import com.interview.buysellstock.service.StockExchangeService;

public class BasicClientCommandController implements ClientCommandController {

    private BaseStockExchangeService service;
    private static final String CREATE_USER = "create_user";
    private static final String ADD_STOCK = "add_stock";

    public void registerBaseService(StockExchangeService service) {
        this.service = (BaseStockExchangeService)service;
    }

    public String takeAction(Object object) {

        String command = (String)object;
        String[] inputs = command.split(" ");
        if(inputs[0].equalsIgnoreCase(CREATE_USER)){
            User user = this.service.createUser(inputs[1]);
            return String.format("User %s is created successfully",user.getUserName());
        }
        return "Invalid Command";
    }


}
