package com.example.airport;

import model.Booking;
import model.Passenger;
import model.Flight;
import model.Flight_type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    public static List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT b.seat_number, p.name, p.passport_number, f.flight_number, f.destination, f.capacity " +
                    "FROM bookings b " +
                    "JOIN passengers p ON b.passenger_id = p.passenger_id " +
                    "JOIN flights f ON b.flight_id = f.flight_id";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Passenger p = new Passenger(rs.getString("name"), rs.getString("passport_number"));
                Flight f = new Flight_type(rs.getString("flight_number"), rs.getString("destination"), rs.getInt("capacity"));
                bookings.add(new Booking(p, f, rs.getString("seat_number")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookings;
    }
}
