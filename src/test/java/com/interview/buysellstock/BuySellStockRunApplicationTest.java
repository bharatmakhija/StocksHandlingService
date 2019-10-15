package com.interview.buysellstock;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BuySellStockRunApplicationTest {

    @Test
    public void testMainApplicationStart() throws IOException {
        BuySellStockRunApplication buySellStockRunApplication = mock(BuySellStockRunApplication.class);
        BuySellStockRunApplication.setApp(buySellStockRunApplication);
        String[] args = {};
        BuySellStockRunApplication.main(args);
    }


    @Test
    public void testMultipleMainApplicationInstanceCreation() throws Exception{
        BuySellStockRunApplication buySellStockRunApplicationFirst = BuySellStockRunApplication.getApp();
        BuySellStockRunApplication buySellStockRunApplicationSecond = BuySellStockRunApplication.getApp();
        assertEquals(buySellStockRunApplicationFirst,buySellStockRunApplicationSecond);
    }
}
