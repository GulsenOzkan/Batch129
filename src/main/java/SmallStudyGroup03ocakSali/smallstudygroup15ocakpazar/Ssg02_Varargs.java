package SmallStudyGroup03ocakSali.smallstudygroup15ocakpazar;

public class Ssg02_Varargs {


    public static void main(String[] args) {

        // Birden fazla sayilari toplayan method olusturun.

        add(3);
        add(3, 4);
        add(3, 4, 5);
        add(1, 2, 3, 4, 5, 6, 7);

    }

    public static void add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w; // sum = sum +w
        }
        System.out.println(sum);
    }


}




