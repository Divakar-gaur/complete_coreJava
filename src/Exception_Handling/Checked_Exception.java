package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {
    public static void main(String[] args) {
        try {
            m1();
        }catch (FileNotFoundException e){
            System.out.println(e);
            System.out.println("handled");
        }
    }
    public static void m1() throws FileNotFoundException, NullPointerException, ClassCastException{
        m2();
    }
    public static void m2() throws FileNotFoundException{
        FileReader r=new FileReader("D:\\chrome downloads\\jspider\\src\\basic\\hgvb.java");
        //REMOVE ANY CHARACTER from file_name TO FINED EXCEPTION

        System.out.println("reading data");
    }
}
