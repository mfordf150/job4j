package ru.job4j.array;

import static ru.job4j.array.FindLoop.indexOf;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {

            int min = indexOf(data, i + 1, i, data.length);
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[i];
                    data[min] = j;
                }
            }

        }
        return data;
    }
}

