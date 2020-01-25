package ru.job4j.loop;
import org.junit.Assert;
import org.junit.Test;
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
    Factorial factorial = new Factorial();
    int result  = factorial.calc(5);
    Assert.assertEquals(result, 120);
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial2 = new Factorial();
        int result  = factorial2.calc(0);
        Assert.assertEquals(result, 1);
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}