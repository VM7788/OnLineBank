package card;

public class DebitCard extends Card {
    public static int countDebitCard;

    public DebitCard(String numOfCard, String dateOfIssue, int pinCode, String typeOfCard) {
        super(numOfCard, dateOfIssue, pinCode, typeOfCard);
        countDebitCard++;

    }

    public void speak() {

        System.out.println("Карта с пин-кодом " + getPinCode() + " действительна");
    }
}