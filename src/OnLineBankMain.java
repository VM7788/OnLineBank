import account.AccStatement;
import card.DebitCard;
import human.Client;
import service.Greeting;

import java.util.Scanner;

import static service.AccountService.printCreateNewAccount;
import static service.BalanceService.printBalance;
import static service.ListOfPinCodeAndClientService.printListOfClientsListOfPinCode;
import static service.PopolnenieService.printPopolnenieAccount;

public class OnLineBankMain {

    public static void main(String[] args) {

        BankOffice bankOffice = Builder.buildBankOffice();

        Client client1 = Builder.buildClient();

        DebitCard clientDebitCard1 = Builder.buildDebitCard1();

        DebitCard clientDebitCard2 = Builder.buildDebitCard2();

        DebitCard clientDebitCard3 = Builder.buildDebitCard3();

        int[] listOfPinCode = Builder.buildListPinCode(clientDebitCard1, clientDebitCard2, clientDebitCard3);

        AccStatement clientStatement1 = Builder.buildAccStatement1();

        AccStatement clientStatement2 = Builder.buildAccStatement2();

        AccStatement clientStatement3 = Builder.buildAccStatement3();

        String[] listOfClient = Builder.buildListClient(clientStatement1, clientStatement2, clientStatement3);

        Greeting.printGreeting();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

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

