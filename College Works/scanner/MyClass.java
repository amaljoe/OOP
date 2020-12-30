import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a :");
    int a = sc.nextInt();
    System.out.println("Enter b :");
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("a + b = " + c);
    sc.close();
  }
}