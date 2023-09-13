import java.util.ArrayList;

/**
 * klasa opisująca zespół uczniów
 */
public class Klasa {
    private String nazwa;
    private ArrayList<Uczen> uczniowie;

    public Klasa(String nazwa)
    {
        this.nazwa = nazwa;
        uczniowie = new ArrayList<>();
    }

    /**
     * dodajUczniaDoKlasy - metoda która dodaje obiekt klasy uczeń do listy uczniowie
     * @param uczen obiekt klasy uczen prezentujący ucznia dodawanego do zespołu klasowego
     * @return brak
     */
    public void dodajUczniaDoKlasy(Uczen uczen)
    {
        if (uczniowie.contains(uczen))
        {
            System.out.println("Ten uczeń już jest w klasie");
        }
        else
        {
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
