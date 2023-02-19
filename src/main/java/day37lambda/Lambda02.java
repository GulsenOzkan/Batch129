package day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {

    /*
        AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
        herhangi bir elemanla eşleşme durumunda true dönecektir.

        AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
        bu şarta uyması durumunda true dönecektir.

        NoneMatch: Şarta göre Stream içindeki hiç bir
        elemanın şartı sağlamaması durumunda true dönecektir.
     */
    public static void main(String[] args) throws IOException {


        // 1) LambdaTextFile icindeki metni consola yazdiran kodu yaziniz.

        Files
                .lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                forEach(System.out::println);

        // 2) LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz.
        Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithSpace);
        System.out.println();
        // 3) LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz.

        boolean result1 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t -> t.contains("Java")); // Herhangi bir kelime"Java" ise true olur
        System.out.println(result1); // true

        /*
            AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
            herhangi bir elemanla eşleşme durumunda true dönecektir.
         */

        // 4) LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz

        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t -> t.contains("a")); // Her kelime "a" harfini icerirse sonuc true olur aksi halde false olur
        System.out.println(result2); // false

        // 5) LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz.
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t -> t.contains("x"));
        System.out.println(result3); // true

        // 6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz

        // 1.YOL TAVSIYE EDILEN

        long result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                count();
        System.out.println(result4); // 3

        // 2. YOL TAVSIYE EDILMEYEN

        int result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                collect(Collectors.toList()).size();
        System.out.println(result5); // 3
    }
}
