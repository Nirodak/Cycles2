package ru.netology.stats;

public class StatsService {


    //Сумма всех продаж
    public long calcSumAllSales(long[] salesAmount) {
        long summAllSales = 0;
        for (int i = 0; i < salesAmount.length; i++) {
            summAllSales = summAllSales + salesAmount[i];
        }
        return summAllSales;
    }

    //Средняя сумма продаж за месяц
    public long calcAverageSumAllSales(long[] salesAmount) {
        long averageSummAllSales = 0;
        int summMonth = 0;
        for (int i = 0; i < salesAmount.length; i++) {
            summMonth++;
            averageSummAllSales = calcSumAllSales(salesAmount) / summMonth;

        }
        return averageSummAllSales;
    }

    //Месяц пиковых продаж
    public int calcMonthWithMaxSales(long[] salesAmount) {
        int monthWithMaxSales = 0;
        for (int i = 0; i < salesAmount.length; i++) {
            if (salesAmount[i] > salesAmount[monthWithMaxSales]) {
                monthWithMaxSales = i;
            }
        }
        return monthWithMaxSales+1;
    }

    //Месяц минимальных продаж
    public int calcMonthWithMinSales(long[] salesAmount) {
        int monthWithMinSales = 0;
        for (int i = 0; i < salesAmount.length; i++) {
            if (salesAmount[i] < salesAmount[monthWithMinSales]) {
                monthWithMinSales = i;
            }
        }
        return monthWithMinSales+1;
    }

    //Кол-во месяцев с продажами выше среднего
    public int calcMonthAboveAverageSales(long[] salesAmount) {
        int monthAboveAverageSales = 0;
        long averageSummAllSales = calcAverageSumAllSales(salesAmount);
        for (int i = 0; i < salesAmount.length; i++) {
            if (salesAmount[i] > averageSummAllSales) {
                monthAboveAverageSales++;
            }
        }
        return monthAboveAverageSales;
    }

    //Кол-во месяцев с продажами ниже среднего
    public int calcMonthBelowAverageSales(long[] salesAmount) {
        int monthBelowAverageSales = 0;
        long averageSummAllSales = calcAverageSumAllSales(salesAmount);
        for (int i = 0; i < salesAmount.length; i++) {
            if (salesAmount[i] < averageSummAllSales) {
                monthBelowAverageSales++;
            }
        }
        return monthBelowAverageSales;
    }
}




