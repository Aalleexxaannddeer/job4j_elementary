package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            if (word[word.length - 1] != post[post.length - 1]) {
                return false;
            }
        }
        return result;
    }
}
