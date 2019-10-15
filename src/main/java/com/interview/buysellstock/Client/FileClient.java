package com.interview.buysellstock.Client;

import com.interview.buysellstock.Controller.BasicClientCommandController;
import com.interview.buysellstock.Controller.ClientCommandController;

import java.io.IOException;
import java.io.PrintStream;

public class FileClient implements Client {

    private ClientCommandController clientCommandController;

    public FileClient() {

    }

    public void run(PrintStream ps) throws IOException {
    }

    public void registerService(ClientCommandController clientCommandController) {
        this.clientCommandController = clientCommandController;
    }
}
