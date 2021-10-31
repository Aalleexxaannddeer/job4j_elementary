package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum;
        for (sum = 0; start <= finish; start++) {
            sum = start + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 2));
        System.out.println(sum(4, 5));
    }
}
