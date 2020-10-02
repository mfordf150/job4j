package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left;
        return result < left ? result : right;
    }
    public static double max(int left, int right, int down) {
        int tmp = max(right, down);
        return max(left, tmp);
    }
    public static int max(int left, int right, int down, int up) {
        int tmp = max(down, up);
        return (int) max(left,right,tmp);

    }

}
