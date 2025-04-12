package File_Handling;

import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\chrome downloads\\jspider\\file1.txt");
        System.out.println(f.mkdir());
        //System.out.println(f.createNewFile());
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getAbsolutePath());
        File f1=new File("D:\\chrome downloads\\jspider\\file2.txt");
        System.out.println(f.renameTo(f1));

    }
}
