package FileExceptionHandling;

// 8) Write a Java program that read from a file
// and write to file by handling all file related exceptions.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("text.txt");
        FileWriter fw = new FileWriter("new.txt");
        int ch;
        //read the contents of file
        while((ch = fr.read()) != -1){
            //write each character to new file
            fw.append((char)ch);
        }
        //close file writer and file reader
        fr.close();
        fw.close(); 
    }
}