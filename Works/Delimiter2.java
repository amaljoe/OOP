import java.util.*;

public class Delimiter2 {
    public static void main(String args[]) {
        String str, token;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the numbers separated by comma");
        str = s.nextLine();
        int sum = 0;
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            token = st.nextToken(",");
            System.out.println(token);
            sum = sum + Integer.parseInt(token);
        }
        System.out.println("Sum=" + sum);
        s.close();
    }
}