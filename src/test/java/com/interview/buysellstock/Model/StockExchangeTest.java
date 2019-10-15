package com.interview.buysellstock.Model;

import com.interview.buysellstock.factory.UserFactory;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockExchangeTest {

    @Test
    public void singletonTest(){
        StockExchange stockExchange = StockExchange.getStockExchange();
        StockExchange stockExchangeSecond = StockExchange.getStockExchange();
        assertEquals(stockExchange,stockExchangeSecond);
    }


    @Test
    public void registerUserInStockExchange(){
        User x = UserFactory.getUser();
        x.setUserName("test");
        StockExchange stockExchange = StockExchange.getStockExchange();
        String res = stockExchange.registerUser(x);
        assertEquals(res,"User test registered to stockExchange \n");
    }

    @Test
    public void registerExistingUserInStockExchange(){
        User x = UserFactory.getUser();
        x.setUserName("test");
        StockExchange stockExchange = StockExchange.getStockExchange();
        stockExchange.registerUser(x);
        String res = stockExchange.registerUser(x);
        assertEquals(res,"User with username test is already registered \n");
    }


    @Test
    public void unRegisterUserFromStockExchange(){
        User x = UserFactory.getUser();
        x.setUserName("test");
        StockExchange stockExchange = StockExchange.getStockExchange();
        stockExchange.registerUser(x);
        String res = stockExchange.unregisterUser(x);
        assertEquals(res,"User test Un-registered from stockExchange \n");
    }


    @Test
    public void unRegisterNonRegisteredUserFromStockExchange(){
        User x = UserFactory.getUser();
        x.setUserName("test");
        StockExchange stockExchange = StockExchange.getStockExchange();
        //stockExchange.unregisterUser(x);
        String res = stockExchange.unregisterUser(x);
        assertEquals(res,"User with username test is not registered \n");
    }

    @After
    public void cleanUp(){
        StockExchange.setStockExchangeForMocking(null);
    }

}
