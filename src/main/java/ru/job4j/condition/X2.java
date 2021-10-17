package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
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
        int rslOne = X2.calc(aOne, bOne, cOne, xOne);
        System.out.println(rslOne);
        int aTwo = 0;
        int bTwo = 1;
        int cTwo = 1;
        int xTwo = 1;
        int rslTwo = X2.calc(aTwo, bTwo, cTwo, xTwo);
        System.out.println(rslTwo);
        int aThree = 0;
        int bThree = 1;
        int cThree = 1;
        int xThree = 1;
        int rslThree = X2.calc(aThree, bThree, cThree, xThree);
        System.out.println(rslThree);
        int aFour = 0;
        int bFour = 1;
        int cFour = 1;
        int xFour = 1;
        int rslFour = X2.calc(aFour, bFour, cFour, xFour);
        System.out.println(rslFour);

    }
}