package ru.natology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        StatsService calculate = new StatsService();
        long sumResult = calculate.sumSales(sales);
        long avg = sumResult / sales.length;
        return avg;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int SalesBelowAvg(long[] sales) {
        int month = 0;
        StatsService calculate = new StatsService();
        long avgSalesResult = calculate.avgSales(sales);
        for (long sale : sales) {
            if (sale < avgSalesResult){
                month = month + 1;
            }
        }
        return month;
    }

    public int SalesUpAvg(long[] sales) {
        int month = 0;
        StatsService calculate = new StatsService();
        long avgSalesResult = calculate.avgSales(sales);
        for (long sale : sales) {
            if (sale > avgSalesResult){
                month = month + 1;
            }
        }
        return month;
    }

}
