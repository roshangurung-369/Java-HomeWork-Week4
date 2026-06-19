class Course {
    private String title;
    private int duration;
    private String instructor;

    public Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void getCourseInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Instructor: " + instructor);
    }
}

class LiveCourse extends Course {

    private String scheduleTime;

    public LiveCourse(String title, int duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    @Override
    public void getCourseInfo() {
        System.out.println("=== Live Course ===");
        super.getCourseInfo();
        System.out.println("Schedule Time: " + scheduleTime);
    }
}

class RecordedCourse extends Course {

    private int videoCount;

    public RecordedCourse(String title, int duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    public void getCourseInfo() {
        System.out.println("=== Recorded Course ===");
        super.getCourseInfo();
        System.out.println("Video Count: " + videoCount);
    }
}

public class CoursePortal {
    public static void main(String[] args) {

        Course[] courses = {
                new LiveCourse("Java OOP", 10, "Mr. Sharma", "7:00 PM"),
                new RecordedCourse("Python Basics", 8, "Ms. Gupta", 25)
        };

        for (Course c : courses) {
            c.getCourseInfo();
            System.out.println();
        }
    }
}