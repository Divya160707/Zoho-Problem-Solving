abstract class Payment {
    abstract void pay(double amount);
    void receipt() {
        System.out.println("Payment receipt generated");
    }
}
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class abstractpaysys{
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);
        p.receipt();

        p = new UPIPayment();
        p.pay(500);
    }
}
