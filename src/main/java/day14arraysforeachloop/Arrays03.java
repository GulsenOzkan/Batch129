package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        /*
         EXAMPLE 1: String bir rray olusturun.
                    - 6 tane eleman () -> yerlestirin
                    - karakter sayisi 5'ten cok olan elemanlari silin
         */

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
        System.out.println(Arrays.toString(colors)); // [Red, Orange, Blue, Yellow, Green, Brown]
        /*
             LOGIC :
             Yeni bir array olusturup, karakter sayisi 5 ve 5;ten kucuk olan elemanlari transfer edecegiz.
             Boylelikle yeni array'de karakter sayisi 5'den buyuk olan hicbir eleman olmayacak.

             SORU : Hocam, array olusturmak icin iki sey belirlenmelidir.
                    1) Elemanlarin data type'i
                    2) Yeni array'de kac tane eleman olacak.
         */

        // Verilen array'de karakter sayisi 5 ve 5'den kucuk olan kac eleman var.
        int counter = 0;

        for(String w: colors){
            if (w.length() <= 5){
                counter++;
            }
        }
        // Yeni array olustur

        System.out.println(counter);
        String newColors[] = new String[counter];

        // Karakter sayisi 5 ve 5'den kucuk olanlari yei array'e transfer et
        int idx = 0;

        for (String w : colors){
            if (w.length()<=5){
                newColors[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors)); // [Red, Blue, Green, Brown]

























    }
}
