import java.util.ArrayList;

public class Klasa {
    private String nazwa;
    private ArrayList<Uczen> uczniowie;

    public Klasa(String nazwa)
    {
        this.nazwa = nazwa;
        uczniowie = new ArrayList<>();
    }

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
