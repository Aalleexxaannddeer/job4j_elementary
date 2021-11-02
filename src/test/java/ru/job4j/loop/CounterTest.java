package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromZeroToTenThenFiftyFive() {
        int one = 0;
        int finish = 10;
        int result = Counter.sum(one, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenNumbersFromZeroToTenThenthirty() {
        int two = 0;
        int finish = 10;
        int result = Counter.sumByEven(two, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenNumbersFromZeroToTenThenEighteen() {
        int three = 3;
        int finish = 8;
        int result = Counter.sumByEven(three, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }
}