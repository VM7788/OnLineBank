package service;

import BankOffice.BankOffice;
import account.AccStatement;
import card.DebitCard;

import java.util.Scanner;

import static service.AccountService.printCreateNewAccount;
import static service.BalanceService.printBalance;
import static service.ListOfPinCodeAndClientService.printListOfClientsListOfPinCode;
import static service.PopolnenieService.printPopolnenieAccount;

public class PrintResultOfChoice {

    public static void printResultOfChoice(BankOffice bankOffice, DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3, int[] listOfPinCode, AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3, String[] listOfClient, Scanner scanner, int a) {
        switch (a) {
            case 1:
                printBalance(bankOffice, clientDebitCard1, clientDebitCard2, clientDebitCard3, clientStatement1, clientStatement2, clientStatement3, listOfClient, scanner);

            case 2:
                printCreateNewAccount();
                break;

            case 3:
                if (printPopolnenieAccount(clientDebitCard1, clientDebitCard2, clientDebitCard3, clientStatement1, clientStatement2, clientStatement3, scanner))
                    break;
            case 4:
                printListOfClientsListOfPinCode(listOfPinCode, listOfClient);
                break;
            default:
                System.out.println("неверный пин-код");

        }
    }
}
