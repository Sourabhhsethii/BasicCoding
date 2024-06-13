package com.server.build;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;

public class SimpleServer {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting Your Own Server");

            HttpServer server = HttpServer.create(new InetSocketAddress(8081), 10);
            server.createContext("/test", new MyHandler());
            server.createContext("/home",new Home());
            server.createContext("/time",new Time());
            server.setExecutor(Executors.newFixedThreadPool(10)); // creates a default executor
            server.start();

    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            System.out.println(t.getHttpContext());
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class Home implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.out.println(exchange.getHttpContext().getPath());
            String response = "Lets Make it";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes(StandardCharsets.UTF_8));
            os.close();
        }
    }

    static class Time implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.out.println(exchange.getHttpContext().getPath());
            String response = "{ server_time : " + LocalDateTime.now() + " }";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes(StandardCharsets.UTF_8));
            os.close();
        }
    }
}
