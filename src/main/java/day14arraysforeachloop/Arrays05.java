package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

       // NOTE 1: sort() method'u sayisal data type'larini kucukten buyuge siralar (ascending order).
       // NOTE 2: sort() method'u String data type'larini alfabetik olarak siralar (alphabetical order).
       // NOTE 3: ascending order + alphabetical order ==> Natural Order
       //Note 4: sort() method'u array elemanlarini "Natural Order" a gore siralar.

        // NOTE 5: binarySearch() method'u bir elemanin bir array'de olup olmadigini kontrol etmek icin kullanilir.
        //         binarySearch() method'unu kullanmadan once sort() method'unu kullanmak zorundayiz.
        //         sort() method'unu kullanmazsaniz aldiginiz sonuc guvenilir olmaz.


        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";



        Arrays.sort(colors); // [Blue, Brown, Green, Orange, Red, Yellow]
        System.out.println(Arrays.toString(colors));

        int num1 = Arrays.binarySearch(colors, "Blue");
        System.out.println(num1); // 0

        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2); // 3

        int num3 = Arrays.binarySearch(colors, "Black");
        System.out.println(num3); // -1





































    }
}
