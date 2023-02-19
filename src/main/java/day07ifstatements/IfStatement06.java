package day07ifstatements;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        /*
            Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazan kodu yaziniz

            0 - 4 ==> BEBEK
            5 - 12 ==> COCUK
            13 - 20 ==> GENC
            21 - 30 YETISKIN
            Tanimlanmamis Evre
            Hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int age = input.nextInt();

        if(age < 0 ){
            System.out.println("Gecerli bir yas giriniz");
        }else if(age < 5){
            System.out.println("BEBEK");
        }else if(age < 13){
            System.out.println("COCUK");
        }else if (age <= 21) {
            System.out.println("GENC");
        }else if(age <31){
            System.out.println("YETISKIN");
        }
        System.out.println("Tanimlanmamis yas");
    }
}
