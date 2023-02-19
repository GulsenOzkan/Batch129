package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    /*
         - Bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolun kalana bakin
         - Bir tamsayiyi bir tamsayiya bolerseniz sonuc kesinlikle tamsayi olur. Ondalik kismi atar.
     */
    public static void main(String[] args) {

        /*
        Kullanicidn alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamaginin rakamlari toplamini yazdirin
         */
        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz");

        int number = input.nextInt();

        // Son rakami al
        int lastDigit = number%10;
        number = number/10;

        // Sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number / 10;

        // Sondan ucuncu rakami al
        int lastThirtDigit = number %10;
        number = number/10;

        // Sondan dorduncu rakam
        int lastFourthDigit = number%10;
        number = number/10;

        // Sondan besinci rekam
        int lastFifthDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);


    }
}




