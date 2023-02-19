package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    // Kullanicidan data alip kodlarimizda kullanacagiz.


    public static void main(String[] args) {

        // 1. ADIM: Scanner Class'dan object olustur.
        Scanner input = new Scanner(System.in);

        // 2. ADIM: Kullaniciya ne istediginize dair mesaj giriniz.
        System.out.println("Lutfen yasinizi giriniz...");

        // 3. ADIM: Uygun method'u kulllanarak kullanicinin verdigi data'yi memory'e yerlestirin.
        byte age = input.nextByte();
        System.out.println(age);
    }
}
