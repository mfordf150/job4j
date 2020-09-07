package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int index = 0;
        String text = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                text = array[i];
                array[i] = null;
                array[index] = text;
                index = index + 1;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
