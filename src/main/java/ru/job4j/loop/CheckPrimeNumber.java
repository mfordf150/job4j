package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        if ((number % 5) == 0) {

        } else if ((number % 4) == 0) {

            return false;
        } else if ((number % 1) == 0) {

            return false;
        }


        return prime;
    }

}

