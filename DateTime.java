import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        //call functions from inbuilt packages 
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        //print date and time
        System.out.println("Date : " + date);
        System.out.println("Time : " + time);
    }
}
