/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class TimeZoneOffset {
    public static void main(String[] args){

        // Create a Scanner

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the offset time: ");

        long offsetTime = input.nextLong();

        // find the current time

        long totalMilliseconds = System.currentTimeMillis();

        //Obtain total seconds =

        long totalSeconds = totalMilliseconds / 1000;

        //Compute current second

        long currentSecond = totalSeconds % 60;

        // Obtain total Minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain the current minutes

        long currentMinutes = totalMinutes % 60;

        // Obtain the total hours

        long totalHours = totalMinutes / 60;

        // Obtain the current hours

        long currentHours = totalHours % 24;

        long currentTime = currentHours + offsetTime;

        System.out.println("The current time is " + currentTime + ":" + currentMinutes + ":" + currentSecond);
    }
}
