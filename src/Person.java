import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    static void saveResult(Result[] results, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Result result : results) {
            if (result != null) {
                writer.write(result.toString());
                writer.newLine();
            }
        }
        writer.close();
    }
}
