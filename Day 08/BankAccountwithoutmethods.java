class BankAccount {
    String accountHolderName;
    double balance;

    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if(amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Dharshini", 1000);

        try {
            acc.withdraw(500);
            acc.withdraw(-10);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed");
        }
    }
}
