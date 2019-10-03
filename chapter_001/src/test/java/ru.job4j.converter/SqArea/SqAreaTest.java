package ru.job4j.SqArea;

import org.junit.Test;



import static junit.framework.TestCase.assertEquals;

public class SqAreaTest {


        @Test
        public void square() {
            SqArea sq = new SqArea();
            double in = (int) sq.square(4, 1);
            double expected = 1.0;
            assertEquals(in, expected);


        }

}
