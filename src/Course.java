public class Course {

    private Professor couseProfessor;
    private int courseWorkload;
    private String courseName;

    public Course(int courseWorkload) {
        this.courseWorkload = courseWorkload;
    }

    public int getCourseWorkload() {
        return courseWorkload;
    }
}
