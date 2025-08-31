class BankAccount {
    String accountHolder;
    double balance;
	static String bankName = "CDAC Bank";

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdraw: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal or insufficient balance!");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
	
	static void displayBankName(){
		System.out.println("Bank name: "+bankName);
	}

    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Rahul Sharma", 50000.0);
        BankAccount acc2 = new BankAccount("Anjali Verma", 30000.0);

        System.out.println("Initial Account Details:");
		acc1.displayBankName();
        acc1.displayAccountDetails();
		acc1.deposit(10000);    
        acc1.withdraw(15000);
		
		acc2.displayBankName();
        acc2.displayAccountDetails();
        acc2.deposit(5000);      
        acc2.withdraw(35000);   

        System.out.println("\nFinal Account Details:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
