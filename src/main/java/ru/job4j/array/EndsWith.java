package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = 0; index < word.length; index++) {

            if (post[post.length - 1 - index] == word[word.length - 1 - index])  {
                result = true;
            } else{
                result = false;
                break;
            }
        }

        return result;

    }

}
