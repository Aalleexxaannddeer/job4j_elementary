package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        /* Задача:
        Периметр прямоугольника: p = 2 * (L + h), где L - длина; h - высота.
        В задании известно, что длина больше высоты в k  раз, т.е  L = h * k.
        Необходимо вычислить длину и высоту прямоугольника, и площадь. Если известны:
        Если p = 6, а k = 2, то площадь будет равна S = 2;
        Если p = 4, а k = 1, то площадь будет равна S = 1.
        S = L * h; - формула площади прямоугольника.
        Решение:
        1. 6 = 2 * (h * 2 + h);
        6 = 2 * 2h + 2h;
        6 = 4h + 2h;
        6 = 6h;
        h = 6/6 = 1;
        L = 1 * 2 = 2;
        S = 2 * 1 = 2.

        2. 4 = 2 * (h * 1 + h);
        4 = 2h + 2h;
        4 = 4h;
        h = 4/4 = 1;
        L = 1 * 1 = 1;
        S = 1 * 1 = 1.
         */
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
