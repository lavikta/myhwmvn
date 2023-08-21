package ru.netology.services;

public class FreelanceService<months> {
    public int calculate(int income, int expenses, int threshold) {

        int months = 0;
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                months++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }

        return months;
    }

}