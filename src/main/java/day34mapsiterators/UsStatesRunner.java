package day34mapsiterators;

public class UsStatesRunner {
    public static void main(String[] args) {

        String arizonaAbbr = UsStates.ARIZONA.getAbbreviation();
        System.out.println(arizonaAbbr); // AZ

        UsStates arizona = UsStates.ARIZONA;
        System.out.println(arizona); // ARIZONA


        /*
            i) Enum bir data deposudur.
            ii) Enum'in icine sabit, degisme ihtimali olmayan datalari koyariz.
                Mesela yilin aylari, Haftanin gunleri, ABD'nin eyaletleri,
                Honda icin yapilan App'lerde Crv, Accord class'lari enum'dir.
            iii)Sabit datalari app'in icine gommek icin enum kullaniriz.
                App'ler "standalone" (kendi basina ayakta durabilmesi icin) olmasi gerektigi icin sabit datalari
                app'in icine gomeriz.
         */


    }
}
