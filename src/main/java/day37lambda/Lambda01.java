package day37lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println("*********************************************");
        System.out.println(getSumFromSevenToSeventy()); // 2464
        System.out.println("*********************************************");
        System.out.println(getMultiplicationFromThreeTNine1()); // 181440
        System.out.println("*********************************************");
        System.out.println(getMultiplicationFromThreeTNine2()); // 181440
        System.out.println("*********************************************");
        System.out.println(getFaktorial(-5)); // -1
        System.out.println("*********************************************");
        System.out.println(getSomOfEvensBetweenTwoInt(5, 14)); // 36
        System.out.println("*********************************************");
        System.out.println(getSumOfDigitsBetweenTwoInts(12, 18)); // 30
        System.out.println("*********************************************");

        // System.out.println("*********************************************");

        // System.out.println("*********************************************");

        // System.out.println("*********************************************");

        //  System.out.println("*********************************************");

        // System.out.println("*********************************************");

        // System.out.println("*********************************************");


    }

    // 1) Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz
    public static int getSumOfAllElements(List<Integer> myList) {
        return myList.stream().reduce(Math::addExact).get(); // 60

    }
    // 2) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    public static int getSumFromSevenToSeventy() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    }

    // 3) 3'den 9'a kadar tum tamsayilarin carpimini veren method'u olusturun.
    public static int getMultiplicationFromThreeTNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    }

    public static int getMultiplicationFromThreeTNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
    }

    // 4) Size verilen sayinin faktoryelini hesaplayan kodu yazniz.
    public static int getFaktorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    }

    // 5) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSomOfEvensBetweenTwoInt(int a, int b) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    }
    // 6) Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
    //    12 ve 18 ==> 13 14 15 16 17 ==> 4 + 5 + 6 + 7 + 8 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a +1, b).map(Utils::getSumOfDigits).sum();
    }

}



