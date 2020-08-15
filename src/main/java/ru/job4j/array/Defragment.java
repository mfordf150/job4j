package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {

        for (int index = array.length - 1; index >= 0; index--) {
            for (int j = 0; j < index; j++) {
                if (array[j] == null) {
                    array[j] = array[j + 1];
                    array[j + 1] = null;

                }
                int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
            }
            System.out.print(array[index] + " ");
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
