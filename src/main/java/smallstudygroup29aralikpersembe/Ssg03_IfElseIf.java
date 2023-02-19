package smallstudygroup29aralikpersembe;

import java.util.Scanner;

public class Ssg03_IfElseIf {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir 100 uzerinden notunuzu giriniz");

        int not = scan.nextInt();


        if (not < 0 || not > 100) {
            System.out.println("Lutfen gecerli not giriniz");
        } else if (not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");
        } else if (not < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }


    }
}
