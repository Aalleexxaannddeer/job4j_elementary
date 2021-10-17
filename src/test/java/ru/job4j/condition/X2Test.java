package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /* Входные парамметры. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* срвнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
        int aOne = 1;
        int bOne = 1;
        int cOne = 1;
        int xOne = 1;
        int expectedOne = 3;
        int rslOne = X2.calc(aOne, bOne, cOne, xOne);
        Assert.assertEquals(expectedOne, rslOne);
        int aTwo = 0;
        int bTwo = 1;
        int cTwo = 1;
        int xTwo = 1;
        int expectedTwo = 2;
        int rslTwo = X2.calc(aTwo, bTwo, cTwo, xTwo);
        Assert.assertEquals(expectedTwo, rslTwo);
        int aThree = 1;
        int bThree = 1;
        int cThree = 0;
        int xThree = 1;
        int expectedThree = 2;
        int rslThree = X2.calc(aThree, bThree, cThree, xThree);
        Assert.assertEquals(expectedThree, rslThree);
        int aFour = 1;
        int bFour = 1;
        int cFour = 1;
        int xFour = 0;
        int expectedFour = 1;
        int rslFour = X2.calc(aFour, bFour, cFour, xFour);
        Assert.assertEquals(expectedFour, rslFour);
    }
}
