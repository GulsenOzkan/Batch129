package smallstudygroup08ocakpazar2;

public class Ssg02_Scope {
    static int x = 15;// class level


    public static void main(String[] args) {

        int i; // method level

        for (i = 1; i <= 5; i++) {

            System.out.println(i);

        }

        {
            System.out.println(i);
            int z = 12;  // block level
        }
        //    System.out.println(x);


    }
}
