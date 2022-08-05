package ru.natology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService calculate = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void minSalesTest() {
        int expected = 9;
        int actual = calculate.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void sumSalesTest() {
        int expected = 180;
        long actual = calculate.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesTest() {
        int expected = 15;
        long actual = calculate.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        int expected = 8;
        long actual = calculate.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SalesBelowAvgTest() {
        int expected = 5;
        long actual = calculate.SalesBelowAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SalesUpAvgTest() {
        int expected = 5;
        long actual = calculate.SalesUpAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

}
