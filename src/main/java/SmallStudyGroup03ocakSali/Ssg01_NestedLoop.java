package SmallStudyGroup03ocakSali;

public class Ssg01_NestedLoop {
    public static void main(String[] args) {

        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*

         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         */
        System.out.println("========= 1 . yontetem nested siz loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        System.out.println("========= 2 . yontetem nested ile loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
            for (int j = 1; j <= 4; j++) {

                System.out.print("*" + " ");

            }
            System.out.println();


        }

    }
}
