public class Flight {
    String flightNumber;
    String destination;
    int oryndar;


    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.oryndar = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void printInfo() {
        System.out.println("Flight: " + flightNumber + ", Destination: " + destination + ", Capacity: " + oryndar);
    }
}

