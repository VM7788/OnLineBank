package credits;

public class AutoCredit extends Credit{

    private boolean casco;
    public AutoCredit(String typeOfCredit, byte percent, byte term, boolean casco) {
        super(typeOfCredit, percent, term);
        this.casco = casco;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }
}