package smallstudygroup08ocakpazar1;

import java.util.Scanner;

public class Ssg07_Arrays {
    public static void main(String[] args) {
      /*
        7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
        true veya false sonucu donen bir method olusturun.
        */
        String isimler[] = {"sadik", "abdurrahman", "yasemin", "omer"};


        contains(isimler);

    }

    public static boolean contains(String[] isimler) {

        boolean sonucdeger = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen aranan kelimeyi giriniz");
        String arananisim = scan.nextLine();


        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(arananisim)) {
                sonucdeger = true;
            }

        }
        if (sonucdeger) {
            System.out.println("aradıgınız kelime array icinde bulunmaktadir");
        } else System.out.println("aradıgınız keime array icinde bulunmamaktadir");

        return sonucdeger;
    }

}

