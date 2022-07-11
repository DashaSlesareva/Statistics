package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void sumSalesTest() {
        StatsService service = new StatsService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageSalesTest() {
        StatsService service = new StatsService();

        double expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        double actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxMonthTest() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minMonthTest() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void lowerThanAverageMonthsAmountTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.lowerThanAverageMonthsAmount(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void higherThanAverageMonthsAmountTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.higherThanAverageMonthsAmount(sales);

        assertEquals(expected, actual);
    }

}