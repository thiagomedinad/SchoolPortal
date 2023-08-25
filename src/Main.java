// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Course c1 = new Course(100);
        Professor p1 = new Professor();
        s1.setRemainingHours(c1.getCourseWorkload());

        System.out.println(s1.getTuition());
        System.out.println(s1.getRegistrationCode());
        System.out.println(s1.getTotalHours());
        System.out.println(s1.getEntryDate());
        System.out.println(s1.getRemainingHours());
        System.out.println(s1.getFirstName());
        System.out.println(s2.getFirstName());
    }
}