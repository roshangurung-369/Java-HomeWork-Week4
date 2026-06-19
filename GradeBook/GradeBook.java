class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }
}

class GraduateStudent extends Student {

    private String thesisTopic;

    public GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    public void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {

        int[] marks1 = {85, 90, 78, 92};
        int[] marks2 = {88, 76, 95, 89};

        Student s1 = new Student("Rahul", 101, marks1);

        GraduateStudent s2 = new GraduateStudent("Anita", 102, marks2, "AI in Education");

        System.out.println("Student: " + s1.getName());
        System.out.println("Average Marks: " + s1.calculateAverage());

        System.out.println();

        System.out.println("Graduate Student: " + s2.getName());
        System.out.println("Average Marks: " + s2.calculateAverage());
        s2.printThesisTitle();
    }
}