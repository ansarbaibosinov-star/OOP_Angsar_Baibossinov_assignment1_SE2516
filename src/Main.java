public class Main {

    public static void main(String[] args) {


        Flight f1 = new Flight_type("KC101", "Almaty", 180);
        Flight f2 = new Flight_type("KC102", "Astana", 160);
        Flight f3 = new Flight_type("KC103", "Madrid", 200);


        Passenger p1 = new Passenger("Ayan", "P12345");
        Passenger p2 = new Passenger("Dana", "P54321");


        Booking b1 = new Booking(p1, f1, "12A");
        Booking b2 = new Booking(p2, f2, "18C");

        f1.printInfo();
        f2.printInfo();

        p1.printInfo();
        p2.printInfo();

        b1.printInfo();
        b2.printInfo();

        Flight[] flights = {f1,f2,f3};
        for (int i = 0; i < flights.length - 1; i++) {
            for (int j = 0; j < flights.length - 1 - i; j++) {
                if (flights[j].getCapacity() > flights[j + 1].getCapacity()) {
                    Flight swap = flights[j];
                    flights[j] = flights[j + 1];
                    flights[j + 1] = swap;
                }
            }
        }

        System.out.println("Capacity: ");
        for(int i = 0;i< flights.length;i++){
            flights[i].printInfo();
        }



    }
}
