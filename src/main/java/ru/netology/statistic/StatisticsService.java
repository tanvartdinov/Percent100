package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {  // {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}