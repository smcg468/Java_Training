package Challenges.GreenNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenNumberTest {

    @Test
    void firstNthDigit() {
        assertEquals(1, GreenNumber.Green(1));
    }

    @Test
    void secondNthDigit() {
        assertEquals(25, GreenNumber.Green(2));
    }

    @Test
    void thirdNthDigit() {
        assertEquals(36, GreenNumber.Green(3));
    }
}