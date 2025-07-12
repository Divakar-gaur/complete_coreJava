package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("D:\\chrome downloads\\jspider\\f2.txt");
        try(ObjectInputStream o=new ObjectInputStream(f)){
            Student s=(Student) o.readObject();
            System.out.println(s);
            System.out.println("deserialization done");
        }catch (Exception e){

        }

    }
}
