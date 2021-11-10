package ru.job4j.loop;
//amount - это сумма выданная по кредиту; salary - годовой доход; percent - процентная ставка.
public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > salary) {
            year = 1;0
        }
        return year;
    }
}
