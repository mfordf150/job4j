package job4j.converter;

public class Converter {


    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;

    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int rubleEuro = euroToRuble(2);
        int rubleDollar = dollarToRuble(2);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar. ");
        System.out.println("2 euro are " + rubleEuro + " rubles. ");
        System.out.println("2 dollar are " + rubleDollar + " rubles. ");

    }

}
