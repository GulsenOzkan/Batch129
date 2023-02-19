package smalstudygroup27araliksali;

import java.util.Scanner;

public class Ssg05_Ternary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();

       String r = sayi % 2 == 0 ? "Cift" : "Tek";
        System.out.println(r);

        if (sayi % 2 == 0) {
            System.out.println("cift");
        } else {
            System.out.println("Tek");
        }

        System.out.println(sayi % 2 == 0 ? "Cift" : "Tek");

        //Pozitif sayılar için non sıfır mutlak değeri sayı ile aynıdır
        //Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarp
        // Bir sayinin mutlak degerini bulmak icin kodu yaziniz

        double num = -1;
        System.out.println(num > 0 ? num : -1 * num);












    }
}
