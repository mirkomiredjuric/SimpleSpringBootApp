package com.mirko.entity;

public class Student {

    private int id;
    private String ime;
    private String kurs;

    public Student(int id, String ime, String course) {
        this.id = id;
        this.ime = ime;
        this.kurs = course;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }
}
