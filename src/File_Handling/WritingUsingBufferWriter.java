package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class WritingUsingBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("D:\\chrome downloads\\jspider\\f2.txt",true);
        BufferedWriter bf=new BufferedWriter(f);
        bf.write("radhe radhe");
        bf.write("radhe radhe");
        bf.write("radhe radhe");
        bf.write("radhe radhe");
        bf.write("radhe radhe");



    }
}
