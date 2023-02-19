package smallstudygroup08ocakpazar1;

import java.util.Arrays;

public class Ssg03_Arrays {
    public static void main(String[] args) {
/*
        3.soru Verilen 3 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin. Ornek; array (1,2,3) ise output (2, 3, 1 olacak
         */
        int arr[]= {3,6,5};
        int atama = arr[0];

        for(int i = 0; i< arr.length-1; i++){
            arr[i] = arr[i+1];

        }
        arr[arr.length-1] = atama;
        System.out.println(Arrays.toString(arr));
    }
}
