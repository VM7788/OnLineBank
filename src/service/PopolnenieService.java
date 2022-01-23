package service;

import account.AccStatement;
import card.DebitCard;

import java.util.Scanner;

public class PopolnenieService {

    public static boolean printPopolnenieAccount(DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3, AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3, Scanner scanner) {
        System.out.println("Для пополнения счета, необходимо ввести пин-код карты");
        int b = scanner.nextInt();

        if (b == clientDebitCard1.getPinCode()) {
            System.out.println("Введите сумму: ");
            double c = scanner.nextDouble();
            c = (c + clientStatement1.getBalanceOfRecipientAcc());
            System.out.println("Баланс карты составляет: " + c);
            return true;
        }
        if (b == clientDebitCard2.getPinCode()) {
            System.out.println("Введите сумму: ");
            double c = scanner.nextDouble();
            c = (c + clientStatement2.getBalanceOfRecipientAcc());
            System.out.println("Баланс карты составляет: " + c);
            return true;
        }
        if (b == clientDebitCard3.getPinCode()) {
            System.out.println("Введите сумму: ");
            double c = scanner.nextDouble();
            c = (c + clientStatement3.getBalanceOfRecipientAcc());
            System.out.println("Баланс карты составляет: " + c);
            return true;
        } else System.out.println("пин-код неверный.");
        return false;
    }

}
