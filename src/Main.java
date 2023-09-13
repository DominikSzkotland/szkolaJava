public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osoba1 = new Osoba();
        osoba1.setImie("janek");
        osoba1.setWiek(12);
        System.out.println(osoba1.getImie());
        System.out.println(osoba1.getWiek());
    }
}