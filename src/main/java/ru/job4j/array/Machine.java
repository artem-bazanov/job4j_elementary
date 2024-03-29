package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int prise) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - prise;
        for (int coin : coins) {
            while (cash >= coin) {
                cash = cash - coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
