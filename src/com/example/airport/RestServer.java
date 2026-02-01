package com.example.airport;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class RestServer {

    public static void start() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/flights", exchange -> {
            try {
                sendJson(exchange, FlightDAO.getAllFlights());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        server.createContext("/passengers", exchange -> {
            try {
                sendJson(exchange, PassengerDAO.getAllPassengers());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        server.createContext("/bookings", exchange -> {
            try {
                sendJson(exchange, BookingDAO.getAllBookings());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        server.start();
        System.out.println("REST API started at http://localhost:8080");
    }

    private static void sendJson(HttpExchange exchange, List<?> data) throws Exception {
        String json = new Gson().toJson(data);
        exchange.getResponseHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, json.getBytes().length);

        try (OutputStream os = exchange.getResponseBody()) {
            os.write(json.getBytes());
        }
    }
}
