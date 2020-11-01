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
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] items = new Item[100];
        int size = 0;
        for (int index = 0; index < items.length ; index++) {
            Item item = items[index];
            if(item != null) {
        }
            else {index--;
            }
        }
        return Arrays.copyOf(items, size++);
    }




    }
   
