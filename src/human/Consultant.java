package human;


public class Consultant extends Person {


    private String doljnost;

    public Consultant(String name, byte age, String gender, String doljnost) {

        super(name, age, gender);
        this.doljnost = doljnost;

    }


    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }
}