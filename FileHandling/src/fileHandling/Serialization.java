package fileHandling;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Student s1 = new Student("Sahil", 15);

        File f1 = new File("C:/Users/sahil/OneDrive/Desktop/CapJava/Student1.txt");

        // Serialization
        try {
        	FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(s1);
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try{
        	FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream in = new ObjectInputStream(fis);
            Student s = (Student) in.readObject();
            System.out.println("Object deserialized successfully!");
            System.out.println("Name: " + s.name);
            System.out.println("ID: " + s.id);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable {
    String name;
    int id;

    Student() {
    	
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}