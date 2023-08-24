public class Student {

    private String firstName;
    private String lastName;
    private int registrationCode = 1000;
    private Class classes;
    private String entryDate;
    private int totalHours;
    private int remainingHours;
    final private int tuition;
    static private int number = 1000;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuition = 120000;
        this.totalHours = 3600;
        this.registrationCode = generateRegistrationCode();
    }

    private int generateRegistrationCode() {
        int registrationCode = number;
        number += 1;
        return registrationCode;
    }
}
