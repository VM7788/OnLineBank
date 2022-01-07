package credits;

public class Ipoteka extends Credit {

    private boolean strahovka;
    public Ipoteka(String typeOfCredit, byte percent, byte term, boolean strahovka) {
        super(typeOfCredit, percent, term);
        this.strahovka = strahovka;
    }

    public boolean isStrahovka() {
        return strahovka;
    }

    public void setStrahovka(boolean strahovka) {
        this.strahovka = strahovka;
    }
}
