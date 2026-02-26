class Employee {
    private double salary = 50000;
    protected String department = "IT";
    String companyPolicy = "Work 9 hours";  // default

    public void displayDetails() {
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Policy: " + companyPolicy);
    }
}
