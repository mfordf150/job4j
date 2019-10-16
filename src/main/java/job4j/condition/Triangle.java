package job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {

        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            System.out.println("Треугольник существует.");
        } else{
            System.out.println("Треугольник не существует.");
    }



        return true;
    }
}



