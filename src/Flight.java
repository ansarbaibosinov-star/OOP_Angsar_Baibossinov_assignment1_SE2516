abstract class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;


    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity>0) {
            this.capacity = capacity;
        }
        else {
            System.out.println("NO");
        }
        }


    abstract void printInfo();

}


