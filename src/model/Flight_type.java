package model;

public class Flight_type extends Flight {
    public Flight_type(String flightNumber, String destination, int capacity) {
        super(flightNumber, destination, capacity);
    }

    @Override
    public void printInfo() {
        System.out.println("Flight: " + getFlightNumber() + ", Destination: " + getDestination() + ", Capacity: " + getCapacity());
    }
}
