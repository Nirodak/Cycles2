import ru.netology.stats.StatsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStatsService {

    public long[] salesAmount = {
            300, 500, 700, 800, 900
    };

    //Тест сумма всех продаж
    @Test
    public void correctCalcSumAllSales() {
        StatsService service = new StatsService();

        long expected = 3200;
        long actual = service.calcSumAllSales(salesAmount);

        assertEquals(expected, actual);
    }

    //Тест средняя сумма продаж за месяц
    @Test
    void correctAverageSumAllSales() {
        StatsService service = new StatsService();

        long expected = 640;
        long actual = service.calcAverageSumAllSales(salesAmount);

        assertEquals(expected, actual);
    }

    //Тест месяц пиковых продаж
    @Test
    void correctMonthWithMaxSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calcMonthWithMaxSales(salesAmount);

        assertEquals(expected, actual);

    }

    //Тест месяц минимальных продаж
    @Test
    void correctMonthWithMinSales() {
        StatsService service = new StatsService();

        int expected = 1;
        int actual = service.calcMonthWithMinSales(salesAmount);

        assertEquals(expected, actual);

    }

    //Тест кол-во месяцев с продажами выше среднего
    @Test
    void correctMonthAboveAverageSales() {
        StatsService service = new StatsService();

        int expected = 3;
        int actual = service.calcMonthAboveAverageSales(salesAmount);

        assertEquals(expected, actual);

    }

    //Тест кол-во месяцев с продажами ниже среднего
    @Test
    void correctMonthBelowAverageSales() {
        StatsService service = new StatsService();

        int expected = 2;
        int actual = service.calcMonthBelowAverageSales(salesAmount);

        assertEquals(expected, actual);
    }

}

