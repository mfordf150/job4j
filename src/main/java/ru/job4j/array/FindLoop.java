package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        int index;
        for (index = start; index < finish; index++) {
            if (data[index] == el) {
                break;
            }


        }


        return rst;
    }


}

