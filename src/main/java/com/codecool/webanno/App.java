package com.codecool.webanno;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class App {


    public static void main(String[] args) throws Exception {
        WebController webController = new WebController();
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/",  new RootController(webController));
        server.setExecutor(null);
        server.start();
    }



}