package File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File fi=new File("D:\\chrome downloads\\jspider1\\f2.txt");
        FileOutputStream f=new FileOutputStream(fi);
        String s="Jspider";
        byte[] b=s.getBytes();
        if(fi.canWrite()) f.write(b);
        else System.out.println("we cant write data");
        f.close();

    }
}
