package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (coordBoard(x1) && coordBoard(x2) && coordBoard(y1) && coordBoard(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }

    public static boolean coordBoard(int num) {
        return num > -1 && num < 8;

    }
}
