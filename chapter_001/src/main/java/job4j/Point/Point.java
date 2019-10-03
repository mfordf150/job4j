package ru.job4j.Point;

public class Point {



    public static double distance(int x1, int y1, int x2, int y2) {

        return Math.sqrt(x1 * y1 + x2 * y2);
    }


    public static void main(String[] args) {


        double result = distance(0, 3, 5, 6);
        System.out.println(" расстояние между точками " + result);


    }

}
