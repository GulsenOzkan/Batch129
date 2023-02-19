package smallstudygroup02ocakpazartesi;

public class Ssg01_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip
        //do  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        int input = 5;

        // Ayni soruyu do-while loop ile yapalim
        int sayi = 1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < input);
    }

    /*
        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);
            sayi++;
        }

         */
}
