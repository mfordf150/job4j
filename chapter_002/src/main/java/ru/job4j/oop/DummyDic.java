package ru.job4j.oop;

public class DummyDic {


    public String engToRus(String eng) {
        String say = "Неизвестное слово.";
        return say;


    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        String say = "Неизвестное слово.";
        dummy.engToRus(say);
        System.out.println("Неизвестное слово.");
    }


}
