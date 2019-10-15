package com.interview.buysellstock.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderService {

    public BufferedReader getBufferedReaderForCommandLineClient(){
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
