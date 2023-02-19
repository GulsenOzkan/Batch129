package smallstudygroup29aralikpersembe;

public class Ssg01_IfElse {
    public static void main(String[] args) {

        //Gündüz dersimiz varsa katılabilirim
        //Gece sınıfımız varsa ona da  katılabilirim

        boolean dt = true;
        boolean nt = false;
        boolean isActiveMi = dt || nt;

        if(dt || nt){
            System.out.println("Katilabilirim");
        }else{
            System.out.println("Katilamam");
        }

        if(isActiveMi){
            System.out.println("Katilabilirim");
        }else{
            System.out.println("Katilamam");
        }








































    }
}
