package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        String ifirstName = input.next();

        // next() method kullanicidan tek kelimeli String almak icin kullanilir.

        System.out.println("Soyisminizi giriniz...");
        String lastName = input.next();

        System.out.println(ifirstName + " " + lastName);

      
    }
}
