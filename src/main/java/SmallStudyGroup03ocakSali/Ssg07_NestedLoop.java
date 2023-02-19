package SmallStudyGroup03ocakSali;

public class Ssg07_NestedLoop {
    public static void main(String[] args) {

        for (int line = 1; line <= 4; line++) {

            System.out.print("|");
            for (int space = 1; space <= (line * -2 + 8); space++) {
                System.out.print(" ");
            }


            System.out.print("*");
            for (int dot = 1; dot <= (line * 4 - 4); dot++) {
                System.out.print("*");
            }


            System.out.print("*");
            for (int space = 1; space <= (line * -2 + 8); space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
