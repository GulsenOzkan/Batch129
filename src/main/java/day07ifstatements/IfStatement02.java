package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // EXAMPLE 2: Kullanicidan alinan bir sayinin yek mi cift mi oldugunu yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();

        // 1. YOL:

        if (num % 2 == 0) {
            System.out.println("Cift sayi...");
        }
        if (num % 2 != 0) {
            System.out.println("Tek sayi...");
        }

        // 2. YOL:

        if (num % 2 == 0) {
            System.out.println("Cift sayi...");
        } else {
            if (num % 2 != 0) {
                System.out.println("Tek sayi...");
            }

        }
    }}
