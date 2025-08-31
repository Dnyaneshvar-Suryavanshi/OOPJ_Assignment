import java.util.Scanner;

class Passenger {
    String name;
    int age;
    String seatType;

    static int totalPassengers = 0;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General"; 
        totalPassengers++;
    }

    Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }

    static void showTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }

    public static void main(String[] args) {

        Passenger p1 = new Passenger("Ravi", 22, "AC Sleeper");
        Passenger p2 = new Passenger("Anita", 21);
        Passenger p3 = new Passenger("Suresh", 24);

        System.out.print("Passenger1: ");
        p1.displayDetails();

        System.out.print("Passenger2: ");
        p2.displayDetails();

        System.out.print("Passenger3: ");
        p3.displayDetails();

        Passenger.showTotalPassengers();
    }
}
