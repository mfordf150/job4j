package ru.job4j.oop.pojo;

public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int group;
    private int receiptDate;

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getreceiptDate() {
        return receiptDate;
    }

    public void setreceiptDate(int receipt_date) {
        this.receiptDate = receiptDate;
    }
}
