package ru.job4j.tracker;

import java.util.Arrays;


public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;


/*
Метод public Item add(Item item) добавляет заявку,
переданную в аргументах в массив заявок items.
В методе add нужно проставить уникальный ключ в объект Item item.
 Это нужно сделать через метод setId.

 */
   
    public Item add(Item item) {
        item.setId(ids++);
        this.items[size++] = item;
        return item;
    }



    public Item[] findAll() {
        return Arrays.copyOf(this.items,size++);
    }


    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.size];
        int sz = 0;
        for (int index = 0; index != this.size; index++) {
            if(this.items[index].getName().equals(key)) {
                rsl[sz++] = this.items[index];
            }

        }
        return Arrays.copyOf(rsl,sz);

    }
        public Item findById(int id) {
            Item rsl = null;
            for (int index = 0; index < size; index++) {
                Item item = items[index];
                if (item.getId() == id) {
                    rsl = item;
                    break;
                }
            }
            return rsl;
        }
    }


   
