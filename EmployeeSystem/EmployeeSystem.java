class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double rate = 500; 

    public Developer(String name, int id, double baseSalary, int overtimeHours) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * rate);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {

        Employee e1 = new Manager("Alice", 101, 50000, 10000);
        Employee e2 = new Developer("Bob", 102, 40000, 20);

        System.out.println(e1.getName() + " Salary: " + e1.calculateSalary());
        System.out.println(e2.getName() + " Salary: " + e2.calculateSalary());
    }
}