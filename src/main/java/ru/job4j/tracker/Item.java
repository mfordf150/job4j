package ru.job4j.tracker;

public class Item {
    int id;
    String name;

    public Item() {

    }

    public Item(int id) {
        this.id = id;

    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public static void main(String[] args) {
        Item item = new Item();
        Item item2 = new Item(1);
        Item item3 = new Item(2, "Jhon");



    }
}

