package com.interview.buysellstock.Client;

import com.interview.buysellstock.Controller.BasicClientCommandController;
import com.interview.buysellstock.Controller.ClientCommandController;

import java.io.IOException;
import java.io.PrintStream;

public interface Client {

    public void run(PrintStream ps) throws IOException;
    public void registerService(ClientCommandController clientCommandController);
}
