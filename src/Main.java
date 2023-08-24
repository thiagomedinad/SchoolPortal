// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Thiago", "Medina");
        Student s2 = new Student("Ryan", "Flores");

        System.out.println(s1.getTuition());
        System.out.println(s1.getRegistrationCode());

        System.out.println(s2.getTuition());
        System.out.println(s2.getRegistrationCode());
    }
}