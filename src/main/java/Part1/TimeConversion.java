package Part1;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
import java.time.LocalTime;

public class TimeConversion {
    public static void timeConversion(String s) {

        String origin = s;
        s = s.substring(0, s.length() - 2);

        String[] arr = s.split(":");
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int seconds = Integer.parseInt(arr[2]);
        LocalTime tm;

        if (origin.contains("PM") && seconds==0) {
            tm = LocalTime.of(hour + 12, min, seconds);
            System.out.println(tm + ":00");
        }else if (origin.contains("PM") && seconds!=0) {
            tm = LocalTime.of(hour + 12, min, seconds);
            System.out.println(tm);
        }else if (seconds ==0 && origin.contains("AM")) {
            tm = LocalTime.of(hour, min, seconds);
            System.out.println(tm + ":00");
        }else if (seconds !=0 && origin.contains("AM")){
            tm = LocalTime.of(hour, min, seconds);
            System.out.println(tm);
        }

    }
}
