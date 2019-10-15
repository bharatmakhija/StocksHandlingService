package com.interview.buysellstock.factory;

import com.interview.buysellstock.Model.IUser;
import com.interview.buysellstock.Model.Mediator;
import com.interview.buysellstock.Model.User;

public class UserFactory {

    public static User getUser(){
        User user = new User();
        return user;
    }

    public static User getUserWithStockExchangeMediator(Mediator mediator, String name){
        User user = new User();
        user.setUserName(name);
        user.setStockExchangeMediator(mediator);
        return user;
    }
}
