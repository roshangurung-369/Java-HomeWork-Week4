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