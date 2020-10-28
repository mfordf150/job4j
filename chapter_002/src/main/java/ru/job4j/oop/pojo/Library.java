package ru.job4j.oop.pojo;
//Для переставления элементов в массиве просто используйте temp перемееную.
// И третий элемент в массиве имеет индекс 2 - нужно это учитывать.
public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 464);
        Book refactoring = new Book("Refactoring", 448);
        Book adaptiveCode = new Book("Adaptive Code", 449);
        Book cleanArchitecture = new Book("Clean Architecture", 352);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = refactoring;
        books[2] = adaptiveCode;
        books[3] = cleanArchitecture;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println();


        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean Code".equals(bk.getName())){
                System.out.println(bk.getName() + " - " + bk.getPage());

            }


        }
    }
}

