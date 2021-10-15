package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        while (money > 0) {
            for (int i = 0; i < coins.length; i++) {
                price = (money >= coins[coins.length - 1 - i]) ? coins[coins.length - 1 - i] : price;
            }
            Arrays.copyOf(rsl, ++size);
            rsl[size - 1] = price;
            money -= price;
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {

        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        for (int i:result) {
            System.out.println(i);
        }
    }
}