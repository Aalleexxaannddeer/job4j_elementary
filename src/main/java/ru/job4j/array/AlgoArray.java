package ru.job4j.array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int tempTwo = array[1];
        array[1] = array[2];
        array[2] = tempTwo;
        int tempThree = array[3];
        array[3] = array[4];
        array[4] = tempThree;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
