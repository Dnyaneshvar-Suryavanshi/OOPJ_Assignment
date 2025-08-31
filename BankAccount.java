class BankAccount{
    String name;
    double balance;
    static double interestRate;

    static {
        interestRate = 4.0;  
        System.out.println("Bank Interest Rate Initialized: "+interestRate+"%");
    }

    void setName(String name) {
        this.name = name;
    }
    void setBalance(double balance) {
        this.balance = balance;
    }

    String getName() {
        return name;
    }
    double getBalance() {
        return balance;
    }
    static double getInterestRate() {
        return interestRate;
    }
    
    void displayDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }

    public static void main(String[] args) {
      
        BankAccount ac1 = new BankAccount();
        ac1.setName("Rohit");
        ac1.setBalance(5000);

        BankAccount ac2 = new BankAccount();
        ac2.setName("Priya");
        ac2.setBalance(15000);
      
        System.out.print("Account1: ");
        ac1.displayDetails();

        System.out.print("Account2: ");
        ac2.displayDetails();
    }
}
