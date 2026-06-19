class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void getRoleDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Student extends Person {

    private String program;

    public Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("=== Student ===");
        super.getRoleDetails();
        System.out.println("Program: " + program);
    }
}

class Teacher extends Person {

    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("=== Teacher ===");
        super.getRoleDetails();
        System.out.println("Subject: " + subject);
    }
}

class Admin extends Person {

    private String department;

    public Admin(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("=== Admin ===");
        super.getRoleDetails();
        System.out.println("Department: " + department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Aarav", 101, "Computer Science"),
                new Teacher("Dr. Sharma", 102, "Java Programming"),
                new Admin("Sita", 103, "Examination Department")
        };

        for (Person p : people) {
            p.getRoleDetails();
            System.out.println();
        }
    }
}