package com.example.airport;

import model.Passenger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAO {
    public static List<Passenger> getAllPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        try (Connection conn = Database.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM passengers");
            while (rs.next()) {
                passengers.add(new Passenger(
                        rs.getString("name"),
                        rs.getString("passport_number")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return passengers;
    }
}
