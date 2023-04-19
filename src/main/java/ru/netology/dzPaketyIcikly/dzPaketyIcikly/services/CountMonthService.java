package ru.netology.dzPaketyIcikly.dzPaketyIcikly.services;

public class CountMonthService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (threshold > expenses * 6) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses * 4;
            } else {
                threshold = threshold + income;
            }
        }
        return count;
    }
}
