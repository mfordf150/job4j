package ru.job4j.loop;

public class Counter {


    public int add(int start, int finish) {

        int i, sum = 0;
        if (start % 2 == 0) {
            start++;
        }
        for (i = start; i <= finish; i += 2) {
            sum += i;
        }


        sum = 0;
        return sum;
    }
}


