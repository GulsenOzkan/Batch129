package day04asciiwrapperclassoperatorsmemoryusage.day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*
            EXAMPLE 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz
            - En az 8 karakter olsun
            - Space karakteri password'de olmasin
            - En az bir tane buyuk harf olsun
            - En az bir tane kucuk harf olsun
            - En az bir tane sembol olsun
            - En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen password'unuzu giriniz");
        String pwd = input.nextLine();

        // En az 8 karakter olsun
       boolean first = pwd.length()>7;

        // Space karakteri password'de olmasin
        boolean second = !pwd.contains(" ");

        // En az bir tane buyuk harf olsun

        // NOTE: Buyuk harf olmayanlari sil, sonra kalan karakter sayisina bak.
        // Karakter sayisi 0 ise buyuk harf yok demektir. 0'dan buyuk ise buyuk harf var demektir.
        boolean third =  pwd.replaceAll("[^A-Z]", "").length()>0;
        // Method'lari ayni satirda yanyana kullanmaya"method chain" denir

        // En az bir tane kucuk harf olsun

        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;

        // En az bir tane sembol (harf ve rakam harici hersey) olsun
        boolean fifth = pwd.replaceAll("[a-zZ-Z0-9]", "").length()>0;


        // En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;

        System.out.println("Password gecerli mi " + (first && second && third && fourth && fifth && sixth));

    }
}
