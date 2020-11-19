package StringTokenizer;

// 9) Write a Java program that reads a line of integers, and then displays each integer, and the
// sum of all the integers (Use String Tokenizer class of java.util). **

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of integers separated by ',' :");
        String line = sc.nextLine();
        StringTokenizer numbers = new StringTokenizer(line, ",");
        int sum = 0;
        while(numbers.hasMoreTokens()){
            int n = Integer.parseInt(numbers.nextToken());
            sum += n;
            System.out.println(n);
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
