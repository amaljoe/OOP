import java.io.IOException;

public class ExceptionHandling {
   public static void main(String args[]) throws IOException {
      try {
         int age = 20;
         if (age < 18)
            throw new MyException();
         else
            System.out.println("You are eligible to vote");
         // throw is used to create a new exception and throw it.
      } catch (MyException e) {
         System.out.println(e);
      } finally {
         System.out.println("I will execute anyway");
      }
   }
}

class MyException extends Exception {

   public String toString() {
      return ("You are not eligible to vote");
   }
}