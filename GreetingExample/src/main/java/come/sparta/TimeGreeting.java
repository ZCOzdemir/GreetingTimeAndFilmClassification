package come.sparta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TimeGreeting {
    public static String finalTime(String time) {
        String pattern = "^([01]?\\d|2[0-3]):([0-5]?\\d)$"; //Just a string
        Pattern r = Pattern.compile(pattern); //Turns the string into a pattern
        Matcher m = r.matcher(time); //Matches Time to m.group(0), Hour to m.group(1), Minute to m.group(2)
        if (m.find()) {
            String currentHour = m.group(1); //Hour in String form
            int currentHourInIntegerFormat = Integer.parseInt(currentHour); //Hour in Integer form
            if (currentHourInIntegerFormat >= 5 && currentHourInIntegerFormat < 12) {
                return "Time is " + m.group(0) + ", Good Morning!";
            } else if (currentHourInIntegerFormat >= 12 && currentHourInIntegerFormat <= 18) {
                return "Time is " + m.group(0) + ", Good Afternoon!";
            } else {
                return "Time is " + m.group(0) + ", Good Evening!";
            }
        } else {
            return "Please enter the time in the correct format.";
        }
    }
}
