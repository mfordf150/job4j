package ru.job4j.oop.pojo;

public class Book {
    public static void main(String[] args) {
        Library cleanCode = new Library("Clean Code", 464);
        Library refactoring  = new Library("Refactoring",448);
        Library adaptiveCode = new Library("Adaptive Code",449);
        Library cleanArchitecture = new Library("Clean Architecture", 352);
        Library[] lib = new Library[4];
        lib[0] = cleanCode;
        lib[1] = refactoring;     
        lib[2] = adaptiveCode;
        lib[3] = cleanArchitecture;
        for (int index = 0; index < lib.length; index++) {
            Library lb = lib[index];
            System.out.println(lb.getPage() + " - " + lb.getPage());
        }


      Library[] libraries = {cleanCode, cleanArchitecture};
      Library tmp = libraries[0];
      libraries[0] = libraries[1];
      libraries[1] = tmp;
        for (int index = 0; index < libraries.length ; index++) {
            System.out.println(libraries[index]);
            System.out.println("Replace index[0] to index[3]");


        }
        System.out.println();
    }
}
