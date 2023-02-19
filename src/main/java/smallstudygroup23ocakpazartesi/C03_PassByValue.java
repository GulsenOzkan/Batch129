package smallstudygroup23ocakpazartesi;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*

         */
        int[] b = {2, 5};
        sayiyiDegistir(b);
        System.out.println(b[0]);

    }

    public static void sayiyiDegistir(int[] a) {
        a[0] = 7;

    }
}
