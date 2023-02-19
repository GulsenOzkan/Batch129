package smalstudygroup27araliksali;

import java.util.Locale;
import java.util.Scanner;

public class Ssg03_IfStatement {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String gunIsmi = input.nextLine().toLowerCase(Locale.ROOT);


        if(gunIsmi.equals("Cumartesi") || (gunIsmi.equals("Pazar"))){
            System.out.println("Haftasonu");
        }else{
            System.out.println("Haftaici");
        }
        if (gunIsmi.equals("Pazartesi") ||
                gunIsmi.equals("Sali") ||
                gunIsmi.equals("Carsamba") ||
                gunIsmi.equals("Persembe") ||
                gunIsmi.equals("Cuma")){
            System.out.println("Haftaici");
        }else{
        System.out.println("Haftasonu");









    }
}}
