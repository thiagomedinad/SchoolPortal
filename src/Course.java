import java.util.ArrayList;
import java.util.Scanner;

public class Course {

    private Professor couseProfessor;
    private int courseWorkload;
    static private ArrayList<Course> courseList;
    private String courseName;

    public Course(int courseWorkload) {
        Scanner sc = new Scanner(System.in);
        this.courseWorkload = courseWorkload;
        setCourseName(sc.nextLine());
    }

    public int getCourseWorkload() {
        return courseWorkload;
    }

    public void setCourseName(String subjectName) {
        System.out.print("What's the subject name? ");
        this.courseName = subjectName;
    }
}
