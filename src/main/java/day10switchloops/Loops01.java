package day10switchloops;

public class Loops01 {

    /*
        CODE STANDART:
        1) Takrar olmamalidir.
        2) Dinamik olmalidir.
        3) Tamir ve update kolay yapilabilmelidir.
     */
    public static void main(String[] args) {

        // EXAMPLE 1: Ekrana 5 kere "Hi" yazdiriniz.

        // 1. YOL ==> TAVSIYE EDILMEZ

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // 2. YOL:
        // Ayni adimlar tekrar tekrar yapilmasi gerktiginde "Loop"lar kullanilir. 4 tane loop vardir
        // 1) for-loop  2) while loop  3) do-while loop  4) for-each-loop

        // 1) for-loop
        // baslangic degeri       loop'un calisma sarti   Increment/Decrement
        for(int i = 1        ;       i < 6       ;              i++        ){
            System.out.println("Hi!");
        }

        // EXAMPLE 2: 11'den 14'e kadar tum tamsayilari yazdiran kodu yaziniz.

        for(int i = 11; i < 15; i++){
            System.out.println(i);
        }

        // EXAMPLE 3: 40'den 23'e kadar tum cift tamsayilari yazdiran kodu yaziniz.

        for(int i = 40; i > 22; i--){

            if(i%2==0){
                System.out.println(i);
            }
        }
        // EXAMPLE 4: 18'den 55'ya kadar tum tek sayilari ekrana yazdiriniz.

        for(int i = 18; i < 57; i++){

            if(i%2!=1){
                System.out.println(i);
            }
        }


    }
}
