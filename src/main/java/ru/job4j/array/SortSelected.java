package ru.job4j.array;

import static ru.job4j.array.FindLoop.indexOf;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            for (int j = i ; index < data.length ; j++) {
                if(data[j] < min) {
                 min = data[j];
                }

            }



//            int min = indexOf(data, i + 1, i, data.length);
//            int temp = data[min];
//            data[min] = data[i];
//            data[i] = temp;

        }
        return data;
    }
}

