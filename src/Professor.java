import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Person {

    private ArrayList<Course> courses;
    private int salary;

    public Professor() {
        super();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        System.out.print("What subjects will the professor teach? ");
        System.out.println(courses);
        this.courses.add(course);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        System.out.print("Enter the professor's salary: ");
        this.salary = salary;
    }
}
