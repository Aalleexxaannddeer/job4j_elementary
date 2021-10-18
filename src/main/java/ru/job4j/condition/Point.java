package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static double distanceOne(int x1One, int y1One, int x2One, int y2One) {
        double rslOne = Math.sqrt(Math.pow(x2One - x1One, 2) + Math.pow(y2One - y1One, 2));
        return rslOne;
    }

    public static double distanceTwo(int x1Two, int y1Two, int x2Two, int y2Two) {
        double rslTwo = Math.sqrt(Math.pow(x2Two - x1Two, 2) + Math.pow(y2Two - y1Two, 2));
        return rslTwo;
    }

    public static double distanceThree(int x1Three, int y1Three, int x2Three, int y2Three) {
        double rslThree = Math.sqrt(Math.pow(x2Three - x1Three, 2) + Math.pow(y2Three - y1Three, 2));
        return rslThree;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double resultOne = Point.distanceOne(0, 1, 1, 1);
        System.out.println("resultOne (0, 1) to (1, 1) " + resultOne);
        double resultTwo = Point.distanceTwo(0, 0, 3, 0);
        System.out.println("resultTwo (0, 0) to (3, 0) " + resultTwo);
        double resultThree = Point.distanceThree(2, 0, 3, 0);
        System.out.println("resultThree (2, 0) to (3, 0) " + resultThree);
    }
}
