package ru.job4j.Fit;


import job4j.Fit.Fit;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {


    @Test
    public void manWeight() {


        int in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected,out,0.1);



    }

    @Test
    public void womanWeight() {

        int  in2 = 170;
        int  expected2 = 69;
        double out2 = Fit.womanWeight(in2);
        Assert.assertEquals(expected2,out2,0.1);

    }

}
