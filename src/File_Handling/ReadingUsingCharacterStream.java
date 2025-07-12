package File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class ReadingUsingCharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("D:\\chrome downloads\\jspider\\f2.txt");
        f.read();

        f.close();

        //closing file is mandatory while using reader writer classes.

    }
}
