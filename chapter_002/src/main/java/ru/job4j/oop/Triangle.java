package ru.job4j.oop;

public class Triangle {
    public Point first;
    public Point second;
    public Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public  double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double rsl = -1;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    private boolean exist(double a, double b, double c) {
        return (a + c > b) && (c + b > a) && (b + a > c);
    }
}



