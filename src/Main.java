public class Main {

    public static void main(String[] args) {


        Flight f1 = new Flight("KC101", "Almaty", 180);
        Flight f2 = new Flight("KC102", "Astana", 150);


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


    }
}
