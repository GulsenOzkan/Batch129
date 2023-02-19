package studentpractice01emrebey;

import java.util.Scanner;

public class Q02_EmreBey {
    public static void main(String[] args) {
 /*

        interview Questions1
                * Kullanicidan bir cumle ve bir harf alin,
                * Cumlede harfin kac kere kullanildigini bulup, yazdirin

                     * ORNEK:

                * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e

                * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
                */


            Scanner input = new Scanner(System.in);

            System.out.println("Lutfen bir cumle giriniz");
            String cumle = input.nextLine().toLowerCase();

            System.out.println("Lutfen bir harf giriniz");
            char harf = input.next().toLowerCase().charAt(0);

            int counter=0;

            for (int i = 0; i < cumle.length(); i++) {
                if(cumle.charAt(i)==harf){
                    counter++;
                }

            }
            System.out.println("Girdiginiz cumlede " +harf+ " harf " +counter+ " kere kullanilmistir");
        }


    }

