package ru.job4j.array;

import java.util.Arrays;
public class Machine {
    public static int[] change(int money, int price) {w
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int remains = money - price;
        for (int coin : coins) {
            while (remains >= coin) {
                remains -= coin;
                rsl[size] = rsl[size] + coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
