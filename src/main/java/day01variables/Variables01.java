package day01variables;

import java.util.Scanner;

public class Variables01 {
    public static void main(String[] args) {

        // Variable olusturmak
        // Java cumlesi = Statement
        // Java'da esittir demek "==". Yani Matematikte "=",Java'da "=="
        // Java'da "=" "assignment operator"dir. Sagdaki degeri alir soldakikutuya koyar.
        // Access Modifier yazmazsaniz "access modifier" "default" demektir.
        // Data Type + Variable name ==> Variable Declaration
        //Assignment Operator (Atama OPeratoru) + Variable degeri ==> Assignment
        // Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini (default) koyar.
        // Default degerler sayilar icin sifirdir.
        // Data Type'ini yaziniz    Variable ismi yaziniz   Assignment Operator(Atama operatoru)  Variable degeri    ingilizcedeki nokta gibi
        int               age                                 =                         13                    ;

        // ORNEK 1 : Ogrenci ismi variable olusturup deger olarak Ali Can atayiniz.
        // String'lere verilen degerler cift tirnak icinde olmalidir
        // String'ler icin "default degeri" "null"dir.
        String studentName = "Ali Can";

        /*
        Java'da temelde iki tip data vardir;
        1) primitive data type
            char : Tek karakterler icin kullanilir. A, x, ?, 5,.
            boolean : boolean'lar sadece iki farkli deger alabilir; true veya false.
            byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir. (1 byte)
            short: -32 768 ile 32 767 arasindaki tamsayilar icin kullanilir. (2byte)
            int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icin kullanilir. (4byet)
            long: -9,223,372,036,775,808 ile 9,223,372,036,854,887 arasindaki sayilar icin kullanilir. (8byte)
            float:
            double:
        2) Non-primitive data type
         */

        //ORENEK 2: chr data type'inda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        // NOTE: char data type'inda degerler tek tirnak icine yazilir
        char isminIlkharfi = 'A';

        //ORNEK 3: boolean data type'inde emeklimisin bir variable oluturun ve false degeri atayin.
        boolean emeklimisin = false;

        // ORNEK 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte studentAge = 23;

        //ORNEK 5: short data type'inda site nufusu icin bir variable olusturun ve deger atayiniz
        short siteNufusu = 1200;

        // ORNEK 6: Ulke nufusu icin variable olusturun ve deger atayiniz
        int countryPopulation = 1864184648;

        // ORNEK 7: long data type'inda insan vucundaki hucre sayisi icin variable olusturup deger atamasi yapin
        // NOTE: Bir deger long ise sonuna "L" (tercih edilir) veya "l" konulur.
        long cellNumberInHumanBady = 536584169842564L;
        // Eger deger int'lerin araliginda ise sonuna "L" koymaya gerek yoktur.
        long weightOfSun = 1234567;


    }
}