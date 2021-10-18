package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calcOne(int aOne, int bOne, int cOne, int xOne) {
        return aOne * xOne * xOne + bOne * xOne + cOne;
    }

    public static int calcTwo(int aTwo, int bTwo, int cTwo, int xTwo) {
        return aTwo * xTwo * xTwo + bTwo * xTwo + cTwo;
    }

    public static int calcThree(int aThree, int bThree, int cThree, int xThree) {
        return aThree * xThree * xThree + bThree * xThree + cThree;
    }

    public static int calcFour(int aFour, int bFour, int cFour, int xFour) {
        return aFour * xFour * xFour + bFour * xFour + cFour;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        int aOne = 1;
        int bOne = 1;
        int cOne = 1;
        int xOne = 1;
        int rslOne = X2.calcOne(aOne, bOne, cOne, xOne);
        System.out.println(rslOne);
        int aTwo = 0;
        int bTwo = 1;
        int cTwo = 1;
        int xTwo = 1;
        int rslTwo = X2.calcTwo(aTwo, bTwo, cTwo, xTwo);
        System.out.println(rslTwo);
        int aThree = 1;
        int bThree = 1;
        int cThree = 0;
        int xThree = 1;
        int rslThree = X2.calcThree(aThree, bThree, cThree, xThree);
        System.out.println(rslThree);
        int aFour = 1;
        int bFour = 1;
        int cFour = 1;
        int xFour = 0;
        int rslFour = X2.calcFour(aFour, bFour, cFour, xFour);
        System.out.println(rslFour);
    }
}