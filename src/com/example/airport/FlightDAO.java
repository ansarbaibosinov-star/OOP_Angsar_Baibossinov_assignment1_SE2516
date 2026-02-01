package com.example.airport;

import model.Flight;
import model.Flight_type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {
    public static List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        try (Connection conn = Database.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM flights");
            while (rs.next()) {
                flights.add(new Flight_type(
                        rs.getString("flight_number"),
                        rs.getString("destination"),
                        rs.getInt("capacity")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;
    }
}
