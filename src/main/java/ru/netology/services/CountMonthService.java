package ru.netology.services;

public class CountMonthService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = threshold - (expenses + (money / 4 * 3));
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
