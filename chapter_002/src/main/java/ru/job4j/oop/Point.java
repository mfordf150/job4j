package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;
    private double z;

    /**Создадим конструктор класса Point для двух точек
     *
     * @param first x
     * @param second y
     */
    public Point(double first, double second) {
        this.x = first;
        this.y = second;
    }


    public Point(double first, double second, double third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }



    public double distance(Point that){
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
}

