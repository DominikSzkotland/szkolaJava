public class Uczen extends Osoba implements Dyzurny{
    private int nrEwidencyjny;
    private static int liczbaUczniow = 0;

    public Uczen(String imie, int wiek, int nrEwidencyjny) {
        super(imie, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
        liczbaUczniow++;
    }

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow++;
        nrEwidencyjny = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrEwidencyjny=" + nrEwidencyjny +
                "} " + super.toString();
    }

    @Override
    public void dyzuruj() {
        System.out.println("Wycieranie tablicy");
    }
}