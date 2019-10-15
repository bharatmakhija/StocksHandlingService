package com.interview.buysellstock.service;

import com.interview.buysellstock.Client.Client;
import com.interview.buysellstock.Client.ClientFactory;
import com.interview.buysellstock.Client.FileClient;

public class ClientHandlerService {

    public Client getClient(String[] args){
        if(args.length > 0)
            return ClientFactory.getFileClient();

        return ClientFactory.getCommandLineClient();
    }
}
