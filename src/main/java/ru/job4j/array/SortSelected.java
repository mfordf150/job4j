package ru.job4j.array;

import static ru.job4j.array.FindLoop.indexOf;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {

            int min = indexOf(data, i + 1, i, data.length);
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;

        }




        return data;


    }

}


