class Ticket{
    private String passengerName;
    private int ticketNo;
    private static int ticketCounter = 5000; 
	
    Ticket(String passengerName) {
        ticketCounter++;
        this.ticketNo = ticketCounter; 
        this.passengerName = passengerName;
    }

    public void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket("Dnyaneshvar");
        Ticket t2 = new Ticket("Deepa");
        Ticket t3 = new Ticket("Rahul");

        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}
