package ru.netology.services;

public class CountMonthService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        threshold = 0;  // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (threshold > income + expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses * 4;
            } else {
                threshold = threshold + income;
            }
        }
        return count;
    }
}
