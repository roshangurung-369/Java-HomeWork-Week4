class Vehicle {
    private String plateNumber;
    private double baseRate;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}