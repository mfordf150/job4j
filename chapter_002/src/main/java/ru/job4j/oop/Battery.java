package ru.job4j.oop;
//Создать класс ru.job4j.oop.Battery. в нем должно быть поле private int load.
//Создать метод public void exchange(Battery another). Этот метод должен списывать заряд из батареи
// у кого вызывали метод exchange и добавить к объекту another.
public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;

    }

    public static void main(String[] args) {
        Battery battery = new Battery(50);
        Battery battery2 = new Battery(10);
        System.out.println("battery : " + battery.load + ". battery2 : " + battery2.load);
        battery.exchange(battery2);
        System.out.println("battery : " + battery.load + ". battery2 : " + battery2.load);


    }
}
