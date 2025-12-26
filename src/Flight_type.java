class Flight_type extends Flight {
    public Flight_type(String flightNumber,String destination,int oryndar){
        super(flightNumber,destination,oryndar);
    }

    @Override
    public void printInfo() {
        System.out.println("Flight: " + getFlightNumber() + ", Destination: " + getDestination() + ", Capacity: " + getCapacity());
    }


}
