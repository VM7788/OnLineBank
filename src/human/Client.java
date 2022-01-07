package human;

public class Client extends Person {

    private int creditRate;

    public Client(String name, int age, String gender, int creditRate) {

        super(name, age, gender);
    }

    public int getCreditRate() {
        return creditRate;
    }

    public void setCreditRate(int creditRate) {
        this.creditRate = creditRate;
    }
}

