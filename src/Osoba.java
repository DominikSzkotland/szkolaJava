public class Osoba {
    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek < 0)
        {
            this.wiek = 0;
        }
        else
        {
            this.wiek=wiek;
        }
    }
}
