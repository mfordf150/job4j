package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean rs1 = number > 1;
        if (rs1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    rs1 = false;
                    break;
                }
            }

        }

return rs1;
    }
    }

