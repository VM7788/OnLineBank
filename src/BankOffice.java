import credits.Credit;

public class BankOffice {

    private String nameOfBankOffice;
    private String addressOfBankOffice;


    public BankOffice(String nameOfBankOffice, String addressOfBankOffice) {
        this.nameOfBankOffice = nameOfBankOffice;
        this.addressOfBankOffice = addressOfBankOffice;

    }


    public String getBankName() {
        return nameOfBankOffice;
    }

    public void setBankName(String bankName) {
        this.nameOfBankOffice = nameOfBankOffice;
    }

    public String getBankAddress() {
        return addressOfBankOffice;
    }

    public void setBankAddress(String bankAddress) {
        this.addressOfBankOffice = addressOfBankOffice;
    }


}

