public class Booking {
    private Passenger passenger;
    private Flight flight;
    private String seatNumber;


    public Booking(Passenger passenger,Flight flight,String seatNumber){
        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }


    public void printInfo() {
        System.out.println("Booking: " + "Flight: " + flight.getFlightNumber() + " Passenger: " + passenger.getName() + " SeatNumber: " + seatNumber);
    }

}


