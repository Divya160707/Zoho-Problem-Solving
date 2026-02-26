class Employee {
    private int id;
    private String name;
    private double salary;

    void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary increased by " + amount);
    }
}
class employeeminisystem {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setDetails(1, "Jamuna", 20000);
        e.display();

        e.increaseSalary(5000);
        e.display();
    }
}
