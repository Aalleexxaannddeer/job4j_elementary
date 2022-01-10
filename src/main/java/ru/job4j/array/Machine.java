package ru.job4j.array;

import java.util.Arrays;
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int remains = money - price;   // остаток монет 50 - 21 = 29
        for (int coin : coins) {
            while (remains >= coin) {   // остаток > coins{10,5,2,1...}
                remains -= coin;    // остаток = остаток - 10 и т.д
                rsl[size] = rsl[size] + coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
