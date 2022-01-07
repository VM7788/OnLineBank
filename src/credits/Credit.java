package credits;

public class Credit {

    private String typeOfCredit;
    private byte percent;
    private byte term;

    public Credit(String typeOfCredit, byte percent, byte term) {
        this.typeOfCredit = typeOfCredit;
        this.percent = percent;
        this.term = term;
    }

    public String getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setTypeOfCredit(String typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }

    public byte getPercent() {
        return percent;
    }

    public void setPercent(byte percent) {
        this.percent = percent;
    }

    public byte getTerm() {
        return term;
    }

    public void setTerm(byte term) {
        this.term = term;
    }
}