package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // EXAMPLE 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup konsol'a yazdiran kodu yaziniz.
        //             3 ==> 3 x 1 =3   3 x 2 = 6 .............. 3 x 10 = 30



        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz.....");
        int num = input.nextInt();

        int i = 1;

        while(i < 11){
            System.out.println(num + "x" + i + "= " + (num * i));
            i++;
        }

        // EXAMPLE 2: Verilen bir String'de her harfin sonrasina "*" sembolunu ekleyiniz
        //              Java ==> J*a*v*a*

        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord = "";
        int k = 0;

        while(k < word.length()){
            newWord = newWord + word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);
    }
}
