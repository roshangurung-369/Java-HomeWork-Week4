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

class Car extends Vehicle {

    public Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate() * days;
    }
}

class Truck extends Vehicle {

    private double loadFee = 2000;

    public Truck(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return (getBaseRate() * days) + loadFee;
    }
}

class Bike extends Vehicle {

    public Bike(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate();
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Vehicle v1 = new Car("CAR123", 1000);
        Vehicle v2 = new Truck("TRK456", 1500);
        Vehicle v3 = new Bike("BIK789", 5000);

        int days = 3;

        System.out.println("Car Rent: " + v1.calculateRental(days));
        System.out.println("Truck Rent: " + v2.calculateRental(days));
        System.out.println("Bike Rent: " + v3.calculateRental(days));
    }
}