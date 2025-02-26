import java.io.StringReader;

public class Address {

    public String firstName;
    public String lastName;

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
