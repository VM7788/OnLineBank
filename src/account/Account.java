package account;

public class Account {

    private String nameOfAcc;   // Название лицевого счета, например, для рублевых переводов
    private String nameOfRecipient;   // Получатель счета
    private int accOfRecipient; // Счет получателя
    private double balanceOfRecipientAcc; // Баланс счета получателя

    public Account(String nameOfAcc, String nameOfRecipient, int accOfRecipient, double balanceOfRecipientAcc) {
        this.nameOfAcc = nameOfAcc;
        this.nameOfRecipient = nameOfRecipient;
        this.accOfRecipient = accOfRecipient;
        this.balanceOfRecipientAcc = balanceOfRecipientAcc;
    }

    public String getNameOfAcc() {
        return nameOfAcc;
    }

    public void setNameOfAcc(String nameOfAcc) {
        this.nameOfAcc = nameOfAcc;
    }

    public String getNameOfRecipient() {
        return nameOfRecipient;
    }

    public void setNameOfRecipient(String nameOfRecipient) {
        this.nameOfRecipient = nameOfRecipient;
    }

    public int getAccOfRecipient() {
        return accOfRecipient;
    }

    public void setAccOfRecipient(int accOfRecipient) {
        this.accOfRecipient = accOfRecipient;
    }

    public double getBalanceOfRecipientAcc() {
        return balanceOfRecipientAcc;
    }

    public void setBalanceOfRecipientAcc(double balanceOfRecipientAcc) {
        this.balanceOfRecipientAcc = balanceOfRecipientAcc;
    }
}