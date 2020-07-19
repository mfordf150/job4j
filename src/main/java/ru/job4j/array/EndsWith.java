package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            if (word[0] != post[index]) {
                result = false;
                break;
            }
        }
        return result;

    }
}
