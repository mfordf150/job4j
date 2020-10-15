package ru.job4j.oop.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Иванов ");
        student.setName("Иван");
        student.setPatronymic(" Иванович");
        student.setGroup(135);
        student.setReceipt_date(2000);

        System.out.println(" Студен: " + student.getSurname() + student.getName() + student.getPatronymic() + " группа - " + student.getGroup() + " дата поступления в " + student.getReceipt_date() + " году!");

    }
}
