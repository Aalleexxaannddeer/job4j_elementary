package ru.job4j.array;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер данного массива равен: " + numbers[i].length);
        }
    }
}
