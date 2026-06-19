class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getTreatmentPlan() {
        System.out.println("General treatment plan");
    }
}

class InPatient extends Patient {

    private int roomNumber;

    public InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("=== InPatient ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Treatment: Full-time hospital care, medication, monitoring");
    }
}

class OutPatient extends Patient {

    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("=== OutPatient ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Treatment: Regular checkups and prescribed medicines");
    }
}



public class HospitalRecords {
    public static void main(String[] args) {

        Patient[] patients = {
                new InPatient("Rahul", 45, 201),
                new OutPatient("Anita", 30, "2026-06-25")
        };

        for (Patient p : patients) {
            p.getTreatmentPlan();
            System.out.println();
        }
    }
}