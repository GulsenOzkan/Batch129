package SmallStudyGroup03ocakSali.smallstudygroup15ocakpazar;

public class Ssg01_Varargs_Olmadan {
    public static void main(String[] args) {
        // Iki sayiyi toplayan bir method olusturun.

        ucSayiToplayanMethod(4,5,6); // uc arguments
        ikiSayiToplayanMethod(5,8); // iki arguments
        display(); // sifir arguments


    }

    private static void ucSayiToplayanMethod(int a, int b, int c) { // uc parametreli
        System.out.println(a + b + c);
    }

    public static void ikiSayiToplayanMethod(int a, int b){ // iki parametreli
        System.out.println(a + b);
    }
    public static void  display(){ // Sifir parametreli

    }
}
