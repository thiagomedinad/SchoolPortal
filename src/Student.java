import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    final private String registrationCode;
    private Class classes;
    final private String entryDate;
    final private int totalHours;
    private int remainingHours;
    final private int tuition;
    static private int id = 1000;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the student's first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Insert the student's last name: ");
        this.lastName = sc.nextLine();

        this.tuition = 120000;
        this.totalHours = 3600;
        this.entryDate = generateEntryDate();
        this.registrationCode = generateRegistrationCode();
    }

    private String generateRegistrationCode() {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String registrationCode = year + "" + id;
        id++;
        return registrationCode;
    }

    private String generateEntryDate(){
        char period = ' ';
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        if (month > 6) {
            period = '2';
        } else {
            period = '1';
        }

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String yearInString = String.valueOf(year);

        return yearInString + "." + period;
    }

    public void setClasses(Class classes) {
        this.classes = classes;
    }

    public void setRemainingHours(int remainingHours) {
        this.remainingHours = remainingHours;
    }

    public Class getClasses() {
        return classes;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public int getRemainingHours() {
        return remainingHours;
    }

    public int getTuition() {
        return tuition;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public int getTotalHours() {
        return totalHours;
    }
}