class Patient {
    private int patientId;
    private String name;
    private String medicalHistory;   // Private (cannot access directly)
    private double billAmount;

    public Patient(int patientId, String name, String medicalHistory, double billAmount) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.billAmount = billAmount;
    }

    // Getter for medical history
    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Public method to update bill
    public void addBill(double amount) {
        billAmount += amount;
    }

    public double getBillAmount() {
        return billAmount;
    }
}
