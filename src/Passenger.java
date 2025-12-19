public class Passenger {
    String name;
    String passportNumber;

    public Passenger(String name,String passportNumber){
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }



    public void printInfo() {
        System.out.println("Passenger: " + name + ", Passport: " + passportNumber);
    }
}
