class Bank {
    void interest() {
        System.out.println("Bank interest");
    }
}

class SBI extends Bank {
    void interest() {
        System.out.println("SBI interest is 7%");
    }
}

class HDFC extends Bank {
    void interest() {
        System.out.println("HDFC interest is 8%");
    }
}

class polymorphism {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.interest();

        b = new HDFC();
        b.interest();
    }
}
