package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int n = (int) array.length / 2;
        for (int i = 0; i < n; i++) {
            int temp = array[0 + i];
            array[0 + i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}