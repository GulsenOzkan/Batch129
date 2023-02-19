package smallstudygroup08ocakpazar1;

import java.util.Arrays;

public class Ssg02_Arrays {
    public static void main(String[] args) {
   /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */

        int sayi[] = {5, 4, 9, 3, 2, 1};
        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));
    }
}
