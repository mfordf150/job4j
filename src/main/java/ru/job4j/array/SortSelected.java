package ru.job4j.array;

public class SortSelected {
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



    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst =  -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {


                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = indexOf(data, min, i, data.length - 1);
            int temp  = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
