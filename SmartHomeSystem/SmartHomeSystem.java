class Device {
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void operate() {
        System.out.println(deviceName + " is operating...");
    }
}

class Thermostat extends Device {

    public Thermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + ": Temperature set to 24°C 🌡️");
    }
}

class SecurityCamera extends Device {

    public SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + ": Recording started 📷");
    }
}

class Light extends Device {

    public Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + ": Light turned on 💡");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Device[] devices = {
                new Light("Living Room Light"),
                new Thermostat("Bedroom Thermostat"),
                new SecurityCamera("Front Door Camera")
        };

        for (Device d : devices) {
            d.operate();
            System.out.println();
        }
    }
}