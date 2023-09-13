public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Osoba osoba1 = new Osoba();
        osoba1.setImie("janek");
        osoba1.setWiek(-12);
        System.out.println(osoba1.getImie());
        System.out.println(osoba1.getWiek());
        Osoba osoba2 = new Osoba( "Dominik",  16);
        System.out.println(osoba2);*/
        
        Uczen uczen = new Uczen("tomek",7, 234);
        Uczen uczen1 = new Uczen("Ala",8);
        Uczen uczen2 = new Uczen("Ela",6);
        System.out.println(uczen);
        System.out.println(uczen1);
        System.out.println(uczen2);
        Nauczyciel nauczycielS = new Nauczyciel("Sebastian",35,"testowanie","bazy danych","WF");
        Nauczyciel nauczycielW = new Nauczyciel("Witosław",50,"matematyka");
        System.out.println(nauczycielS);
        System.out.println(nauczycielW);
        Klasa klasa3P = new Klasa("3P");
        klasa3P.dodajUczniaDoKlasy(uczen);
        klasa3P.dodajUczniaDoKlasy(uczen1);
        klasa3P.dodajUczniaDoKlasy(uczen2);
        Wychowawca nauczycielP = new Wychowawca("Apolonia",70,klasa3P,"technika","muzyka");
        System.out.println(nauczycielP);

    }
}