package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;


public class TriangleTest {
        @Test
        public void whenExist() {
            Point a = new Point(2.0, 8.0);
            Point b = new Point(4.0, 5.0);
            Point c = new Point(10.0, 8.0);
            Triangle tr = new Triangle(a, b, c);
            double result = tr.area(2.0, 8.0, 4.0, 5.0, 10.0, 8.0 );
            closeTo(result, (12.009));


        }

    }