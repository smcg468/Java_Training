package MaxProfit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxProfitTest {

    @Test
    void NoMaxProfit() {
        int[] prices = {7,4,3,2};
        assertEquals(0, maxProfit.maxProfit(prices));
    }

    @Test
    void LargeMaxProfit() {
        int[] prices = {7,4,3,1,9};
        assertEquals(8, maxProfit.maxProfit(prices));
    }

    @Test
    void SmallMaxProfit() {
        int[] prices = {7,4,3,1,2};
        assertEquals(1, maxProfit.maxProfit(prices));
    }

    @Test
    void LargeAmountOfDays() {
        int[] prices = {7,4,3,2,6,8,4,7,5,8,7,8,4,7};
        assertEquals(6, maxProfit.maxProfit(prices));
    }

    @Test
    void SmallAmountOfDays() {
        int[] prices = {7,9};
        assertEquals(2, maxProfit.maxProfit(prices));
    }
}