/**
 * 3. Write a Java program that displays the number of characters, lines and words in a text file.
 */

import java.io.*;

public class Counter {
    public static void main(String[] args) throws IOException {
        File poem = new File("poem.txt");
        FileReader fr = new FileReader(poem);
        int characters  = 0, words = 1, lines = 1;
        int read;
        while((read = fr.read()) != -1) {
            char ch = (char) read;
            if (ch == ' ') {
                words++;
                characters++;
            } else if (ch == '\n') {
                words++;
                lines++;
            } else {
                characters++;
            }
        }
        System.out.println("Number of characters: " + characters);
        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        fr.close();
    }
}
