package com.interview.buysellstock.Client;

import com.interview.buysellstock.service.BufferReaderService;

public class ClientFactory {

    public static FileClient getFileClient(){
        return new FileClient();
    }

    public static CommandLineClient getCommandLineClient(){
        return new CommandLineClient(new BufferReaderService());
    }
}
