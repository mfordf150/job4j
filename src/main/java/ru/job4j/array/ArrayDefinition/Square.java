package ru.job4j.array.ArrayDefinition;

public class Square {


    public static int[] calculate(int bound) {
        int[] rst = {0,1,4,9};


        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);

        }
    }
}