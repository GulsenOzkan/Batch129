package smalstudygroup27araliksali;

import java.util.Scanner;

public class Ssg02_IfStatement {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();

        if(sayi %2 == 0){
            System.out.println("Cift sayi");
        }else{
            System.out.println("TEk sayi");
        }

















    }
}
