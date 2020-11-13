package Exception;

import java.io.*;

public class ExceptionHandling {
    public static void main(String args[]) throws IOException {
       try {
           String name = "Joe";
          int age = 2;
          if (age < 18)
          {
              //throw custom exception
            throw new AgeException();
          }
          else
          {
            System.out.println("You are eligible to vote");
            //write the name of voter to a file
            FileWriter fw = new FileWriter("voters_list.txt");
            fw.append(name + ", ");
            fw.close();
          }
       } catch (AgeException e) {
          System.out.println(e);
       } finally {
          System.out.println("Thank You.");
       }
    }
 }
 
 //define custom exception
 class AgeException extends Exception {
 
    public String toString() {
       return ("You are not eligible to vote");
    }
 }