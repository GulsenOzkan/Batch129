package miniprojebiletbus;

import day04asciiwrapperclassoperatorsmemoryusage.day05typecastingstringmanipulations.TypeCasting01;

import java.util.Scanner;

public class Bilet {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;

        String plakaNumarasi = "09 Ay 35";
        System.out.println("Lutfen gideceginiz mesafeyi km olarak veriniz");

        km = input.nextInt();

        System.out.println("Lutfen yasinizi giriniz");
        yas = input.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz." + "Sadece gidis ise 1 \n gidis-donus ise 2");
        yolculukTipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10;

            System.out.println("Indirimsiz bilet ucreti = " + biletUcreti);
            double yasIndirimOrani = 0;

            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas < 24) {
                yasIndirimOrani = 0.1;
            } else if (yas > 65) {
                yasIndirimOrani = 0.3;
            }
            // double dusulecekDeger = 0;
            // dusulecekDeger = biletUcreti * yasIndirimOrani;
            // biletUcreti = biletUcreti - dusulecekDeger;

            biletUcreti -= biletUcreti * yasIndirimOrani;

            if(yolculukTipi == 2){
                biletUcreti = biletUcreti * 0.2;
                biletUcreti *= 2;
            }
            biletDokum(plakaNumarasi,km,yolculukTipi,biletUcreti);
            System.out.println("Bilet ucreti = " + biletUcreti );
        }else
            System.out.println("Hatali veri girdiniz...");









    }

    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti) {
        System.out.println("=========== Bilet Dokum ===========");
        System.out.println("Otobusun plakasi = " + plakaNumarasi);
        System.out.println("Mesafe = " + km);
        System.out.println("Yolculuk Tipi = " + (yolculukTipi == 1 ? "Tek Yon" : "Gidis - Donus"));
        slowPrint("Keyifli yolculuklar dileriz...",50);
        System.out.println("Bilet ucreti = " + biletUcreti);

    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}