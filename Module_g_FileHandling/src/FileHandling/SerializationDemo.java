package FileHandling;

import java.io.*;

// Serializable class
class Employee implements Serializable {

    int id;
    String name;

    // Not saved during serialization
    transient String password;

    Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class SerializationDemo {

    public static void main(String[] args) {

        try {
            
            // Create object
            Employee emp = new Employee(101, "Aman", "12345");

            // Create file
            FileOutputStream fos = new FileOutputStream("emp.ser");

            // Write object to file
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Object -> Byte Stream
            oos.writeObject(emp);

            oos.close();

            System.out.println("Object Serialized");

            // Read file
            FileInputStream fis = new FileInputStream("emp.ser");

            // Read object from file
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Byte Stream -> Object
            Employee e = (Employee) ois.readObject();

            ois.close();

            // Display values
            System.out.println("Id       : " + e.id);
            System.out.println("Name     : " + e.name);
            System.out.println("Password : " + e.password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}