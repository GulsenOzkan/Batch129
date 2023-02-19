package day28exceptions;

public class Exceptions_02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToInteger(s);

        String t = "1a2b";
        convertStringToInteger(t);
    }

    // Icinde rakamlar disinda karakter olan String'i sayiya cevirmek isterseniz Java "NumberFormatException" atar.
    public static void convertStringToInteger(String s) {

        int intS = 0;
        try {
            intS = Integer.valueOf(s);

        } catch (NumberFormatException e) {
            System.out.println("Bir String'in sayiya donusturulmesi icin rakam disi karakter icermesi gerekir. ");
            System.out.println(e.getMessage());
        }
        System.out.println(intS + 1);
    }
}
