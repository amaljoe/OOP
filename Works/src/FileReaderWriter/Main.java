package FileReaderWriter;
// 7) Write a file handling program in Java with reader/writer.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //write to file
        FileWriter fw = new FileWriter("text.txt");
        fw.write("This rewrites a file. ");
        fw.append("This appends to the end of file");
        fw.close();
        //read the contents of file
        FileReader fr = new FileReader("text.txt");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
