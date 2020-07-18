package ru.job4j.condition;

public class Triangle {


    public static boolean exist(double ab, double ac, double bc) {
        boolean result = false;
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {

            System.out.println("Треугольник существует.");
            result = true;

        } else if (ab + ac < bc && ac + bc < ab && ab + bc < ac) {

            System.out.println("Треугольник  не существует.");

        }

        return result;
    }


    public static boolean exist2(double ab, double ac, double bc) {
        boolean result2 = false;
        if (ab + ac < bc && ac + bc < ab && ab + bc < ac) {
            System.out.println("Треугольник  не существует.");
            result2 = false;
        }
        return result2;
    }
}



