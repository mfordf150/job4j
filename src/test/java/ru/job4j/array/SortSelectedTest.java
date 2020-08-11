package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {


    @Test
    public void whenSort5() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 4, 3, 2, 1, };
        int[] result = SortSelected.sort(input);
        int[] expected = {1, 2, 3, 4, 5, };
        assertThat(result, is(expected));
    }
    @Test
    public void whenSort3() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{3, 2, 1, };
        int[] result = SortSelected.sort(input);
        int[] expected = {1, 2, 3};
        assertThat(result, is(expected));

    }
}




