package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static sun.nio.cs.Surrogate.is;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(2, 11);
        assertEquals(result, is(30));
    
    }


}