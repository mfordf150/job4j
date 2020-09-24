package ru.job4j.oop;

public class Battery {
    private int load;

    public int exchange(Battery another) {
        this.load = this.load + another.load;

        another.load = 0;
        return 0;
    }

    public static void main(String[] args) {
        Battery battery  = new Battery();
        battery.exchange(battery);
        System.out.println("battery charge  %" + battery.exchange(battery));

    }
}
