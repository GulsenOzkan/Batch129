package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        // EXAMPLE 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir ay ismi giriniz giriniz....");

        String monthName = input.next();

        if(monthName.equalsIgnoreCase("Janvier")){
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("Fevrier")){
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("Mars")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("Avril")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("Mai")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("Juin")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("Juillet")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("Aout")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("Septembre")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("Octobre")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("Novembre")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("Decembre")){
            System.out.println(12);
        }else {
            System.out.println("Gecerli bir ay ismi giriniz");
        }

        /*
        NOTE: String'lerin esitligi kontrol edilirken equals() methodu kullanilir.
        Cunku ==> "==" Sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
                  ikiside ayni ise size String'ler esittir der ama biz kod yazarken genellikle adres;leri
                   ile degil degerleri ile ilgileniriz.
                  Bu yuzden "==" kullanmayiz

                  "equals() methodu ise iki String'i karsilastirirken sadece degerlerine bakar,
                  degerler ayni ise bu iki String esittir der
                  degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken ihtiyac duydugumuz seydir.
         */

        String s = "Tom";
        String t ="Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s ==t); // False cunku adreslere ve degerler farkli
        System.out.println(s.equals(t)); // false cunku degerler farkli

        System.out.println(s == r); // false cunku adresler farkli
        System.out.println(s.equals(r)); // true cunku degerlere bakar."s" ve "r" degerleri ayni

        System.out.println(s ==m); // true

        System.out.println(s.equals(m)); // true
    }
}
