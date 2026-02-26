class User {
    String name;

    void login() {
        System.out.println(name + " logged in");
    }
}
class Admin extends User {
    void manageSystem() {
        System.out.println("Admin manages system");
    }
}
class Customer extends User {
    void browse() {
        System.out.println("Customer browsing products");
    }
}
class userroles {
    public static void main(String[] args) {
        Admin a = new Admin();
        a.name = "Admin1";
        a.login();
        a.manageSystem();

        Customer c = new Customer();
        c.name = "User1";
        c.login();
        c.browse();
    }
}
