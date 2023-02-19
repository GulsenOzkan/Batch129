package day22staticblocksconstructors;

/*
  Constructor nedir?
  Class'ta object uretmemize yarayan code block'laridir.

  Class olusturdugumuzda Java bize otomatik olarak bir contructor verir.
  Ama bu constructor gozle gorulmez, gozle gorulmeyen otomatik java tarafindan verilen
  bu constructor'lara "default constructor" denir.

  "default constructor" "Car(){ }" seklindedir.

  Siz kendi constructor'unuzu olusturdugunuzda Java default contructor'u siler.

  Bir class'ta farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.

  Farkli constructor'lar sayesinde bir class'tan farkli farkli object'ler olusturabiliriz.

  INTERWIEW SORUSU :  Method ile constructor'in farki varmidir? varsa nedir?
  Cevap:              Method ile constructor farkli yapilardir.
                      i)Method'larda return type vardir ama constructor'larda return type yoktur
                      ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                      Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir
*/
public class Car {
    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        if (year == 2023) {
            this.year = 0;
        }
        if (hybrid == true) {
            this.hybrid = false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}

