package com.interview.buysellstock.Client;

import com.interview.buysellstock.Controller.ClientCommandController;
import com.interview.buysellstock.service.BufferReaderService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class CommandLineClient implements Client {

    private BufferedReader bufferedReader;
    private ClientCommandController clientCommandController;

    public CommandLineClient(BufferReaderService bufferReaderService) {
        bufferedReader = bufferReaderService.getBufferedReaderForCommandLineClient();
    }

    public void run(PrintStream ps) throws IOException {
        String s = bufferedReader.readLine();
        while (!s.equalsIgnoreCase("exit")){
            String res = (String)this.clientCommandController.takeAction(s);
            ps.println(res);
            s = bufferedReader.readLine();
        }
    }

    public void registerService(ClientCommandController clientCommandController) {
        this.clientCommandController = clientCommandController;
    }
}
