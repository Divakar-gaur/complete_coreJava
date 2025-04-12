package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File fi=new File("D:\\chrome downloads\\jspider1\\f2.txt");
        FileInputStream f=new FileInputStream(fi);
        if(fi.canRead()){
            int n=f.read();
            while (n!=-1){
                System.out.print((char)n);
                n=f.read();
            }
        }
        else
            System.out.println("we cant read data");
    }
}
