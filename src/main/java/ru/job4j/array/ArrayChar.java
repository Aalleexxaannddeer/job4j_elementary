package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (char index = 0; index < word.length; index++) {
            if (word[1] != pref[1]) {
                return false;
            }
        }
        return result;
    }
}
