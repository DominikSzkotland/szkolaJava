import java.util.ArrayList;

public sealed class Nauczyciel extends Osoba implements Dyzurny permits Wychowawca
{
    private ArrayList<String> przedmioty = new ArrayList<>();

    public Nauczyciel(String imie, int wiek, String przedmiot)
    {
        super(imie, wiek);
        przedmioty.add(przedmiot);
    }

    public Nauczyciel(String imie, int wiek, String ...przedmioty)
    {
        super(imie, wiek);
        for (String przed:przedmioty)
        {
            this.przedmioty.add(przed);
        }
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmioty=" + przedmioty +
                "} " + super.toString();
    }

    @Override
    public void dyzuruj() {
        System.out.println("Spacer po korytazu");
    }
}