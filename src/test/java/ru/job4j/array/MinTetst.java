package ru.job4j.array;

import org.junit.Test;

import static sun.nio.cs.Surrogate.is;

public class MinTetst {
    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(new int[]{0, 5, 10}),is(0));
    }

    private void assertThat(int min, boolean b) {
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[]{10, 5, 3}),is(3));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[]{10, 2, 5}),is(2));
    }
}

