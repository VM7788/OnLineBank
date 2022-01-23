import BankOffice.BankOffice;
import account.AccStatement;
import card.DebitCard;
import human.Client;
import service.Greeting;

import java.util.Scanner;

import static service.AccountService.printCreateNewAccount;
import static service.BalanceService.printBalance;
import static service.ListOfPinCodeAndClientService.printListOfClientsListOfPinCode;
import static service.PopolnenieService.printPopolnenieAccount;
import static service.PrintResultOfChoice.printResultOfChoice;

public class OnLineBankMain {

    public static void main(String[] args) {

        BankOffice bankOffice = BankOffice.buildBankOffice();

        Client client1 = Builder.buildClient();

        int[] listOfPinCode = Builder.buildListPinCode(Builder.buildDebitCard1(), Builder.buildDebitCard2(), Builder.buildDebitCard3());

        String[] listOfClient = Builder.buildListClient(Builder.buildAccStatement1(), Builder.buildAccStatement2(), Builder.buildAccStatement3());

        Greeting.printGreeting();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        printResultOfChoice(bankOffice, Builder.buildDebitCard1(), Builder.buildDebitCard2(), Builder.buildDebitCard3(), listOfPinCode, Builder.buildAccStatement1(), Builder.buildAccStatement2(), Builder.buildAccStatement3(), listOfClient, scanner, a);

    }

}

