package day29exceptions;

public class Exceptions_02 {
    /*
        "throw" ile "throws" keyword'leri arasindaki fark nedir?

        1) "throw" method body'si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
        2) "throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir.
           "throws" ise method parantezinden hemen sonra  sadece bir kere kullanilir.
        3) "trow" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
           "throws" dan sonra sadece Exception Class ismi yazilir.
        4)"throw" belli sartlar icin Exception atama kullanilir, "throws" ise application'i
          Exception attiktan sonra durdurur.
     */
    public static void main(String[] args) throws IllegalArgumentException, ArithmeticException {
        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            getMark(900);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // "throw" keyword bir method'un body'si icinde istedigimiz yerde, istedigimiz kosullar,
    // istedigimiz kadar icin Exception atamamizi saglar
    // "throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    // Exception Class constructor'inin parantezi icine istediginiz "Exception Mesaj" ini yazabilirsiniz.
    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");

        } else {
            System.out.println(age);
        }
    }

    // Ogrenci notlari girisi yapan ve notlari konsola yazdiran method olusturun
    public static void getMark(double d) {

        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        }
        System.out.println(d);
    }
}
