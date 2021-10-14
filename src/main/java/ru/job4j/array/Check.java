package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean compare = data[0];
    for (int i = 1; i < data.length; i++) {
        if (data[i] != compare) {
         return false;
        }
    }
        return true;
    }
}