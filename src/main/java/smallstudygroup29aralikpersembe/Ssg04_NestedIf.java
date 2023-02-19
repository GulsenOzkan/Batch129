package smallstudygroup29aralikpersembe;

import java.util.Scanner;

public class Ssg04_NestedIf {
    public static void main(String[] args) {

        // bir kisinin kan baginda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma



        int yas = 18;
        int kilo = 50;

        if(yas >= 18) {
            if (kilo >= 50) {
                System.out.println("Kan bagisi yapabilir");
            } else {
                System.out.println("Kan bagisi yapamazsiniz");
            }
        }else{
            System.out.println("yasiniz 18'den buyuk olmali");


        }





























    }
}
