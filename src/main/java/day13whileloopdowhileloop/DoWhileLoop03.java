package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
            Gecerli Username = "admin Password = "pwd123" dur.
            Kullanicidan username ve password'u alin.
            username ve password dogru ise konsola "Hesabiniza hosgeldiniz!" yazdirin.
            username ve password yanlis ise 3 kere "username ve password'unuzu giriniz" mesaji versin.
            username ve password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesajini vererek islemi tamamlayiniz.
         */

        Scanner input = new Scanner(System.in);




        int counter = 0;

        do{
            if (counter == 4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
            System.out.println("Username'i giriniz");
            String username = input.next();

            System.out.println("Password'unuzu giriniz");
            String password = input.next();

            if(username.equals("admin") && password.equals("pw123")) {
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;
        }while(true);
    }
}
