import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        long[] salesAmount = {
                25, 45, 300, 45, 500, 17, 18, 1000, 18_162_378, 25_763_845, 36_846_823, 24_623_487, 2_346_384
        };

        System.out.println("Сумма продаж " + service.calcSumAllSales(salesAmount));
        System.out.println("Среднее значение " + service.calcAverageSumAllSales(salesAmount));
        System.out.println("Месяц с наибольшим количеством продаж " + service.calcMonthWithMaxSales(salesAmount));
        System.out.println("Месяц с наименьшим количеством продаж " + service.calcMonthWithMinSales(salesAmount));
        System.out.println("Количество месяцев с продажами выше среднего " + service.calcMonthAboveAverageSales(salesAmount));
        System.out.println("Количество месяцев с продажами ниже среднего " + service.calcMonthBelowAverageSales(salesAmount));
    }
}



