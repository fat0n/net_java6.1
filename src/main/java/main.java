import ru.natology.stats.StatsService;

public class main {
    public static void main(String[] args) {
        StatsService calculate = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sumResult = calculate.sumSales(sales);
        System.out.println("Сумма продаж: " + sumResult);
        long avgSalesResult = calculate.avgSales(sales);
        System.out.println("Средние продажи: " + avgSalesResult);
        int maxMonthResult = calculate.maxSales(sales);
        System.out.println("Месяц с пиком продаж: " + maxMonthResult);
        int minMonthResult = calculate.minSales(sales);
        System.out.println("Месяц с минимумом продаж: " + minMonthResult);
        int SalesBelowAvgResult = calculate.SalesBelowAvg(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + SalesBelowAvgResult);
        int SalesUpAvgResult = calculate.SalesUpAvg(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + SalesUpAvgResult);

    }

}
