import account.AccStatement;
import card.DebitCard;
import human.Client;
import service.Greeting;

import java.util.Scanner;

import static service.AccountService.printCreateNewAccount;
import static service.ListOfPinCodeAndClientService.printListOfClientsListOfPinCode;
import static service.PopolnenieService.printPopolnenieAccount;

public class OnLineBankMain {

    public static void main(String[] args) {

        BankOffice bankOffice = BankOffice.buildBankOffice();

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


    public static void printBalance(BankOffice bankOffice, DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3, AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3, String[] listOfClient, Scanner scanner) {
        System.out.println("Введите номер карты:");
        String enter = scanner.nextLine();
        String numOfCard = scanner.nextLine();

        System.out.println("Введите дату выпуска карты (месяц/год в формате **/**:)");
        String dateOfIssue = scanner.nextLine();

        System.out.println("Введите четырехзначный pin карты:");

        int pinCode = scanner.nextInt(); // при выполнении данной строки сканнер считывает вводимые с клавиатуры цифры,затем
        // данный набор цифр (пин код) сохраняется в переменную примитивного типа int с названием scanner.
        System.out.println();
        //               clientDebitCard1.speak();
        System.out.println();

        if (pinCode == clientDebitCard1.getPinCode()) {
            System.out.println("Здравствуйте, " + listOfClient[0]);
            System.out.println("Тип счета: " + clientStatement1.getNameOfAcc());
            System.out.println("номер выписки №" + ' ' + clientStatement1.getNumberOfAccStatement() + 1);
            System.out.println("дата выписки" + ' ' + clientStatement1.getDateOfAccStatement());
            System.out.println("средств на карте: " + clientStatement1.getBalanceOfRecipientAcc() + " рублей");
            System.out.println(bankOffice.getBankName());
            System.out.println(bankOffice.getBankAddress());
        }
        if (pinCode == clientDebitCard2.getPinCode()) {
            System.out.println("Здравствуйте, " + listOfClient[1]);
            System.out.println("Тип счета: " + clientStatement2.getNameOfAcc());
            System.out.println("номер выписки №" + ' ' + clientStatement2.getNumberOfAccStatement() + 1);
            System.out.println("дата выписки" + ' ' + clientStatement2.getDateOfAccStatement());
            System.out.println("средств на карте: " + clientStatement2.getBalanceOfRecipientAcc() + " рублей");
            System.out.println(bankOffice.getBankName());
            System.out.println(bankOffice.getBankAddress());
        }
        if (pinCode == clientDebitCard3.getPinCode()) {
            System.out.println("Здравствуйте, " + listOfClient[2]);
            System.out.println("номер выписки №" + ' ' + clientStatement3.getNumberOfAccStatement() + 1);
            System.out.println("дата выписки" + ' ' + clientStatement3.getDateOfAccStatement());
            System.out.println("средств на карте: " + clientStatement3.getBalanceOfRecipientAcc() + " рублей");
            System.out.println(bankOffice.getBankName());
            System.out.println(bankOffice.getBankAddress());
        } else {
            System.out.println("Пин код неверный.");
        }
    }


    public static void printStatement3(BankOffice bankOffice, AccStatement clientStatement3, String[] listOfClient) {
        System.out.println("Здравствуйте, " + listOfClient[2]);
        System.out.println("номер выписки №" + ' ' + clientStatement3.getNumberOfAccStatement() + 1);
        System.out.println("дата выписки" + ' ' + clientStatement3.getDateOfAccStatement());
        System.out.println("средств на карте: " + clientStatement3.getBalanceOfRecipientAcc() + " рублей");
        System.out.println(bankOffice.getBankName());
        System.out.println(bankOffice.getBankAddress());
    }

    public static void printStatement2(BankOffice bankOffice, AccStatement clientStatement2, String[] listOfClient) {
        System.out.println("Здравствуйте, " + listOfClient[1]);
        System.out.println("Тип счета: " + clientStatement2.getNameOfAcc());
        System.out.println("номер выписки №" + ' ' + clientStatement2.getNumberOfAccStatement() + 1);
        System.out.println("дата выписки" + ' ' + clientStatement2.getDateOfAccStatement());
        System.out.println("средств на карте: " + clientStatement2.getBalanceOfRecipientAcc() + " рублей");
        System.out.println(bankOffice.getBankName());
        System.out.println(bankOffice.getBankAddress());
    }

    public static void printStatement1(BankOffice bankOffice, AccStatement clientStatement1, String[] listOfClient) {
        System.out.println("Здравствуйте, " + listOfClient[0]);
        System.out.println("Тип счета: " + clientStatement1.getNameOfAcc());
        System.out.println("номер выписки №" + ' ' + clientStatement1.getNumberOfAccStatement() + 1);
        System.out.println("дата выписки" + ' ' + clientStatement1.getDateOfAccStatement());
        System.out.println("средств на карте: " + clientStatement1.getBalanceOfRecipientAcc() + " рублей");
        System.out.println(bankOffice.getBankName());
        System.out.println(bankOffice.getBankAddress());
    }

}

