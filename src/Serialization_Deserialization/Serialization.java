package Serialization_Deserialization;

import java.io.*;

class Student implements Serializable {
    String name;
    int age;
    int id;
    int mob;

    public Student(String name, int age, int id, int mob) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", mob=" + mob +
                '}';
    }
}

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student s=new Student("Tara",24,01,12345678);
        FileOutputStream f=new FileOutputStream("D:\\chrome downloads\\jspider\\f2.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(s);
        System.out.println("serialization done");
        o.close();
    }
}
