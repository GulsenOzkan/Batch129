package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // 1) while-loop

        int i = 1;

        while(i < i){
            System.out.println("Sen bir while loopsun...");       // while body hic calismadi.
            i++;                                                  // While-loop'ta Zero Execution mumkundur.
        }

        // 2) do-while-loop

        int k = 1;

        do{
            System.out.println("Sen bir do-while-loopsun...");   // Ekranda "Sen bir do-while-loopsun..." yazisi gorunecek.
            k++;
        }while(k < 1);
        // 1) do-while body calisti
        // 2) do-while kullandigimizda loop body en az bir kere calisir. Zero Execution mumkun degildir.
    }
}
