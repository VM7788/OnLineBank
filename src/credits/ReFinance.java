package credits;

public class ReFinance extends Credit {

    private boolean neverUsed;

    public ReFinance(String typeOfCredit, byte percent, byte term, boolean neverUsed) {
        super(typeOfCredit, percent, term);
        this.neverUsed = neverUsed;

    }

    public boolean isNeverUsed() {
        return neverUsed;
    }

    public void setNeverUsed(boolean neverUsed) {
        this.neverUsed = neverUsed;
    }
}
