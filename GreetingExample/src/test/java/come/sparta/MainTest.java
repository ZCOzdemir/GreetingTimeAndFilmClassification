package come.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Practice Test")
    public void firstTest() {
        Assertions.assertTrue(5 == 5);
    }

    @ParameterizedTest
    @ValueSource(strings = {"5:30", "10:50", "11:25"})
    @DisplayName("Given a time between 5 and 12, finalTime returns good morning")
    public void givenAtTimeBetween5And12_FinalTime_ReturnsGoodMorning(String time) {
        String expectedFinalTime = "Time is " + time + ", Good Morning!";
        String result = TimeGreeting.finalTime(time);
        assertEquals(expectedFinalTime, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12:05", "14:22", "17:55"})
    @DisplayName("Given a time between 12 and 18, finalTime returns good afternoon")
    public void givenAtTimeBetween12And18_FinalTime_ReturnsGoodAfternoon(String time) {
        String expectedFinalTime = "Time is " + time + ", Good Afternoon!";
        String result = TimeGreeting.finalTime(time);
        assertEquals(expectedFinalTime, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"19:30" , "21:24"})
    @DisplayName("Given a time between 18 and 24, finalTime returns good evening")
    public void givenAtTimeBetween18And24_FinalTime_ReturnsGoodEvening(String time) {
        String expectedFinalTime = "Time is " + time + ", Good Evening!";
        String result = TimeGreeting.finalTime(time);
        assertEquals(expectedFinalTime, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"26:30", "22:63"})
    @DisplayName("Given incorrect hours or minutes, finalTime returns Please enter the time in the correct format")
    public void givenIncorrectHoursOrMinutes_FinalTime_ReturnsEnterCorrectFormat(String time){
        String expectedFinalTime = "Please enter the time in the correct format.";
        String result = TimeGreeting.finalTime(time);
        assertEquals(expectedFinalTime, result);
    }

}