package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(long[] sales) {
        double sum = sumSales(sales);
        double average = sum / 12;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int lowerThanAverageMonthsAmount(long[] sales) {
        double average = averageSales(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale < average) {
                amount++;
            }
        }
        return amount;
    }

    public int higherThanAverageMonthsAmount(long[] sales) {
        double average = averageSales(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale > average) {
                amount++;
            }
        }
        return amount;
    }

}
