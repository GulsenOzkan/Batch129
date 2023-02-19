package studentpractice01emrebey;

public class Q03_EmreBey {
    public static void main(String[] args) {
        // Lutfen loop ile asagidaki sekli cikariniz:


//          1 2 3 4 5 6
//           2 3 4 5 6
//            3 4 5 6
//             4 5 6
//              5 6
//               6

        for (int satir = 1; satir <=6 ; satir++) {
            for (int bosluk = 1; bosluk <satir ; bosluk++) {
                System.out.print(" ");

            }
            for (int sayi =satir ; sayi <=6 ; sayi++) {
                System.out.print(sayi +" ");

            }
            System.out.println();


        }


    }
}
