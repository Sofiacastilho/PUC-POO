package pucpr.aulaquatorze.ObjetoSerializavel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscreveObj {
    public static void writePersons(String filename) {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream (new FileOutputStream(filename));
            Person person = new Person();
            person.setFirstName("Luke");
            person.setLastName("Skywalker");
            person.setAge(19);
            outputStream.writeObject(person); //só escreve porque Person é seralizável
            person = new Person();
            person.setFirstName("Darth ");
            person.setLastName("Vader");
            person.setAge(30);
            outputStream.writeObject(person); //só escreve porque Person é seralizável
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally { //Close the ObjectOutputStream
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        writePersons("myFile.txt");
    }
}