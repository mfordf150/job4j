package ru.job4j.loop;

import org.junit.Test;

import static sun.nio.cs.Surrogate.is;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(2, 11);
        assertThat(result, is(30));
    
    }

    private void assertThat(int result, boolean b) {
    }


}