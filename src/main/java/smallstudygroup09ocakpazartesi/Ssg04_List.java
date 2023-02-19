package smallstudygroup09ocakpazartesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ssg04_List {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};

        arr[0] = "F"; // eleman degistirme

        System.out.println(Arrays.toString(arr)); // [A,B,C]

        List<String> arraydenList = Arrays.asList(arr);
        arraydenList.set(0,"D"); // eleman degistirme

        System.out.println(arraydenList); // [A,B,C]
    }
}
