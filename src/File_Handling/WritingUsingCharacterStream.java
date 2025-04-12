package File_Handling;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class WritingUsingCharacterStream {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("D:\\chrome downloads\\jspider1\\f2.txt");
        FileWriter f1=new FileWriter("D:\\chrome downloads\\jspider1\\f2.txt",true);

        //true-> true is written so that earlier data in the file cant be overridden or erased.

        f.write("radhe radhe");
        f.write("krishna");
        f.write("ram");
        f.write("sita");
        f.write("lakshman");
        f.write("hanuman");
        f.close();

        // closing file is mandatory while using reader writer classes.

    }
}
