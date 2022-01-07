package card;

public class CreditCard extends Card {

    public static int countCreditCard;

    public CreditCard(String numOfCard, String dateOfIssue, int pinCode, String typeOfCard) {
        super(numOfCard, dateOfIssue, pinCode, typeOfCard);
        countCreditCard++;

    }

}
