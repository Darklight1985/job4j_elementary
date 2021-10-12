package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int factorial = 1;
       if (n != 0) {
           for (int i = 1; i <= n; i++) {
               factorial *= i;
           }
       } else {
           factorial = 1;
       }
       return factorial;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
