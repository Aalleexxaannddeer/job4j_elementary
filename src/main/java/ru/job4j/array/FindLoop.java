package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (el == data[index]) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
