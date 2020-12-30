
/**
 * 2. Write a Java program that reads a file and displays the file on the screen, 
 * with a line number before each line.
 */

import java.io.*;

public class Lines {
    public static void main(String[] args) throws IOException {
        File poem = new File("poem.txt");
        FileReader fr = new FileReader(poem);
        int lines = 1, read;
        System.out.print("\n" + lines + ". ");
        while ((read = fr.read()) != -1) {
            char ch = (char) read;
            if (ch == '\n') {
                lines++;
                System.out.print("\n" + lines + ". ");
            } else {
                System.out.print(ch);
            }
        }
        fr.close();
    }
}
