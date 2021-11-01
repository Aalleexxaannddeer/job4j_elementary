package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum() {
        int i = 0;
        int finish = 10;
        int result = Counter.sum(i, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEven() {
        int e = 0;
        int finish = 10;
        int result = Counter.sumByEven(e, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
}