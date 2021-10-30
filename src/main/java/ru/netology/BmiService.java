package ru.netology;

public class BmiService {

    /**
     * Расчет индекса массы тела
     * @param weight - вес в килограммах
     * @param height - рост в метрах
     * @return - индекс массы тела
     */
    public double calculate(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}
