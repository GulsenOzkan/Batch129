package smallstudygroup29aralikpersembe;

import java.util.Scanner;

public class Ssg02_IfElse {
    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karacter giriniz");
        char karakter = scan.next().toUpperCase().charAt(0);

        if(karakter >= 'A' && karakter <= 'Z' ){
            System.out.println("Girdiginiz karakter harf");
        }else{
            System.out.println("Girdiginiz karakter harf degil");
        }
























    }
}
