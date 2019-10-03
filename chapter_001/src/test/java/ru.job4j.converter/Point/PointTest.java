package ru.job4j.Point;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PointTest {



    @Test
    public void distance() {
        Point point = new Point();
        double in = point.distance(0, 3, 5, 6);
        double expected = 5.477225575051661;
        assertEquals(expected, in);


    }


}
