package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (y1 - y2 == x1 - x2 || x1 == y2) {
            rsl = x1 - x2;
            rsl = rsl >= 0 && rsl <= 7 ? Math.abs(y1 - y2) : 0;
        }
        return rsl;
    }
}