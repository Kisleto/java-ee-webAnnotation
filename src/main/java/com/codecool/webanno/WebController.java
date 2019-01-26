package com.codecool.webanno;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class WebController {

    @WebRoute(path = "/test")
    void onTest(HttpExchange httpExchange) throws IOException {
        redirectToPath(httpExchange, "/test");
    }

    @WebRoute(path = "/")
    void onLanding(HttpExchange httpExchange) throws IOException {
        redirectToPath(httpExchange, "/");

}

    private void redirectToPath(HttpExchange httpExchange, String path) throws IOException {
        httpExchange.getResponseHeaders().add("Location", path);
        httpExchange.sendResponseHeaders(300, -1);

    }
}
