package account;

public class AccStatement extends Account {

    private String titleOfAccStatement;
    private int numberOfAccStatement;
    private String dateOfAccStatement;

    public AccStatement(String nameOfAcc, String nameOfRecipient, int accOfRecipient, double balanceOfRecipientAcc, String titleOfAccStatement, int numberOfAccStatement, String dateOfAccStatement) {
        super(nameOfAcc, nameOfRecipient, accOfRecipient, balanceOfRecipientAcc);
        this.titleOfAccStatement = titleOfAccStatement;
        this.numberOfAccStatement = numberOfAccStatement;
        this.dateOfAccStatement = dateOfAccStatement;
    }

    public String getTitleOfAccStatement() {
        return titleOfAccStatement;
    }

    public void setTitleOfAccStatement(String titleOfAccStatement) {
        this.titleOfAccStatement = titleOfAccStatement;
    }

    public int getNumberOfAccStatement() {
        return numberOfAccStatement;
    }

    public void setNumberOfAccStatement(int numberOfAccStatement) {
        this.numberOfAccStatement = numberOfAccStatement;
    }

    public String getDateOfAccStatement() {
        return dateOfAccStatement;
    }

    public void setDateOfAccStatement(String dateOfAccStatement) {
        this.dateOfAccStatement = dateOfAccStatement;
    }
}