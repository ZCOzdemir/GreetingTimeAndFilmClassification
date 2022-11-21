package come.sparta;

import java.util.Scanner;
import static come.sparta.TimeGreeting.finalTime;

public class Main {
    public static void main(String[] args) {
        String time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time");
        time = sc.nextLine();
        System.out.println(finalTime(time));
    }
}