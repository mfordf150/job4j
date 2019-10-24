package job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));

    }

    @Test
    public void whenSecondMax2() {
        MultiMax check2 = new MultiMax();
        int result2 = check2.max(1, 4, 2);
        assertThat(result2, is(4));

    }

    @Test
    public void whenSecondMax3() {
        MultiMax check3 = new MultiMax();
        int result3 = check3.max(1, 4, 2);
        assertThat(result3, is(4));

    }

    @Test
    public void whenSecondMax4() {
        MultiMax check4 = new MultiMax();
        int result3 = check4.max(1, 4, 2);
        assertThat(result3, is(4));
    }
}