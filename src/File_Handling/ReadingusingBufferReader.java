package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class ReadingusingBufferReader {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("D:\\chrome downloads\\jspider\\f2.txt");
        BufferedReader bf=new BufferedReader(f);
        String s=bf.readLine();
        while (s!=null){
            System.out.println(s);
            s= bf.readLine();
        }
    }
}
