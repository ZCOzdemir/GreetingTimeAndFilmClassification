package come.sparta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FilmClassificationTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("If the age of the viewer is 3 and below then no movies should be available")
    void ageUnderThree(int number) {
        String expected = "No films are available.";
        assertEquals(expected, FilmClassification.availableClassifications(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 7, 10})
    @DisplayName("If the age of the viewer is 11 and below then U and PG movies should be available. 12A films available only if accompanied by an adult")
    void ageBetweenFourToEleven(int number) {
        String expected = "U, and PG films are available. 12A films are available if child is accompanied by adult.";
        assertEquals(expected, FilmClassification.availableClassifications(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("U, PG, 12A and 12 films are available.")
    void ageBetweenTwelveToFourteen(int number) {
        String expected = "U, PG, 12A and 12 films are available.";
        assertEquals(expected, FilmClassification.availableClassifications(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("If age is between 15-17. These films that are U, PG, 12A, 12 and 15 are available.")
    void ageBetweenFifteenToSeventeen(int number) {
        String expected = "U, PG, 12A, 12 and 15 films are available.";
        assertEquals(expected, FilmClassification.availableClassifications(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 187})
    @DisplayName("If the age is 18 or above then all the films are available")
    void eighteenOrAbove(int number) {
        String expected = "All films are available.";
        assertEquals(expected, FilmClassification.availableClassifications(number));
    }

}