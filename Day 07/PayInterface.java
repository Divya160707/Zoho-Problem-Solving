interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

class  PayInterface {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();
    }
}
