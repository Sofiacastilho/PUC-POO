package pucpr.aulaquatorze.ObjetoSerializavel;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LeObj {

    private ArrayList<Person> listaPessoas = new ArrayList<>();

    public static void readPersons(String filename) {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream (new FileInputStream(filename));
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Person) // read a generic object obj
                    System.out.println(((Person)obj).toString()); // cast to Person
            }
        } catch (EOFException ex) { // when EOF is reached
            System.out.println("End of file reached.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally { //Close the ObjectInputStream
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void writePersons(String filename) {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream (new FileOutputStream(filename));
            Scanner scan = new Scanner(System.in);

            int i;
            for (i=0; i<3; i++){
                Person person = new Person();
                person.setFirstName(scan.next());
                person.setLastName(scan.next());
                person.setAge(scan.nextInt());
                outputStream.writeObject(person); //só escreve porque Person é seralizável
            }




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

    public ArrayList<Person> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Person> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public static void main(String[] args) {
        //Person person = new Person();

        //writePersons("myFile.txt");
        readPersons ("myFile.txt");
    }
}
