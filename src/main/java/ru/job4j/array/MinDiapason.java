package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < array.length; i++) {
            if (i < array[start]) {
                min = finish;

                break;
            }


        }
        return min;
    }
}
