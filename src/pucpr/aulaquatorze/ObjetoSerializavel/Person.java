package pucpr.aulaquatorze.ObjetoSerializavel;
import java.io.Serializable;
public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private int age;





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
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(firstName);
        buffer.append("\n");
        buffer.append(lastName);
        buffer.append("\n");
        buffer.append(age);
        buffer.append("\n");
        return buffer.toString();
    }
}