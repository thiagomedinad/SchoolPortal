import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert first name: ");
        setFirstName(sc.nextLine());

        System.out.print("Insert last name: ");
        setLastName(sc.nextLine());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
