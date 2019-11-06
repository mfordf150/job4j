package job4j.Fit;

public class Fit {

    public static double manWeight(double height) {

        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {

        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(170);
        System.out.println("Man 92 is " + man);
        System.out.println("Woman 69 is " + woman);


        int in = 100;
        int expected = 180;
        double out = Fit.manWeight(in);
        boolean passed = expected == out;
        System.out.println("ideal weight " + passed);

        int in2 = 110;
        double expected2 = 0.01;
        double out2 = Fit.manWeight(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("ideal weight " + passed2);

    }
}
