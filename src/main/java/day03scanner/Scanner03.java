package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        System.out.println("Lutfen adresinizi giriniz....");

        // nextLine method'u kullanicidan cok kelimeli String almak icin kullanilir.

        String adress = input.nextLine();
        System.out.println(adress);



    }
}
