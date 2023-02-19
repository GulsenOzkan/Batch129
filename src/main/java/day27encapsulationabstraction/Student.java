package day27encapsulationabstraction;

public class Student {

    // Encapsulation is a data hiding

    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;

    // Encapsulation yapilmis data'yi okuyabilir miyiz?

    // get method'lar encapsule edilmis (saklanmis) datayi okumamiza yarar.
    // get method'larin diger adi " getter " dir.
    // get method'lar her zaman public olur.
    // get method'larin return type'i variable'in data type'i ile ayni olur.
    // get method'larin isimleri get + variable name seklinde olur.
    // get method'larin isimleri variable boolean ise is + variable name seklinde olur.
    // get method'lar parametre kullanmazlar.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
    // Encapsulation yapilmis data'larin degeri degistirilebilir mi?

    // set method'lar (setter) encapsule edilmis data'larin degerlerini degistirmemize yarar.
    // set method'lar her zaman "public" olur.
    // set method'larin return type'i her zaman void olur.
    // set method'larin isimleri "set + variable name" olur.
    // set method'lar parametre kullanirlar. Variable ile ayni data type'inda parametre kullanirlar.

    // getter ve setter'larin ikisine birden "java beans" denir.

    /*
    OOP Principals:
    i)Inheritance +
    ii)Polymorphism: Method Overloading + Method Overriding +
    iii)Encapsulation +
    iv)Abstraction
     */


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
