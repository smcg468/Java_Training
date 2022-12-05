package LargestNum;

import LargestNum.LargestNum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumTest {

    @Test
    void TestingZero() {
        assertEquals(-1, LargestNum.largestNum(0));
    }
    @Test
    void TestingBelowEleven() {
        assertEquals(-1, LargestNum.largestNum(7));
    }

    @Test
    void TestingTwoDigits() {
        assertEquals(72, LargestNum.largestNum(27));
    }

    @Test
    void TestingThreeDigits() {
        assertEquals(421, LargestNum.largestNum(214));
    }

    @Test
    void TestingFourDigits() {
        assertEquals(8642, LargestNum.largestNum(4268));
    }

    @Test
    void TestingWithNumberAtMax() {
        assertEquals(-1, LargestNum.largestNum(421));
    }

    @Test
    void TestingWithLargeNumber() {
        assertEquals(987654332, LargestNum.largestNum(394857632));
    }
}