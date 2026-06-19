public class SmartDevices {
    private String brand;
    private String model;

    public SmartDevices(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Device is turning on");
    }

    public void turnOff() {
        System.out.println("Device is turning off");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        SmartDevices device1 = new SmartPhone("Samsung", "Galaxy S24");
        SmartDevices device2 = new SmartWatch("Apple", "Watch Series 9");

        device1.turnOn();
        device1.turnOff();

        System.out.println();

        device2.turnOn();
        device2.turnOff();
    }
}

class SmartPhone extends SmartDevices {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("SmartPhone " + getBrand() + " " + getModel() + " is booting up.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartPhone " + getBrand() + " " + getModel() + " is shutting down.");
    }
}

class SmartWatch extends SmartDevices {
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("SmartWatch " + getBrand() + " " + getModel() + " display is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartWatch " + getBrand() + " " + getModel() + " is entering sleep mode.");
    }
}
