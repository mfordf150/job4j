package job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {


    @Test
    public void when() {
        int first = 1;
        int second = 4;
        int third = 3;
        int forth = 2;
        int expected = 1;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when2() {
        int first = 4;
        int second = 3;
        int third = 2;
        int forth = 1;
        int expected2 = 2;
        int s2 = SqMax.max(first, second, third, forth);
        assertThat(s2, is(expected2));
    }

    @Test
    public void when3() {
        int first = 3;
        int second = 4;
        int third = 2;
        int forth = 1;
        int expected3 = 3;
        int s3 = SqMax.max(first, second, third, forth);
        assertThat(s3, is(expected3));
    }

    @Test
    public void when4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int expected4 = 4;
        int s4 = SqMax.max(first, second, third, forth);
        assertThat(s4, is(expected4));

    }

}
