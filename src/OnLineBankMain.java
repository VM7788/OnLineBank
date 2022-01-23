import account.AccStatement;
import card.DebitCard;
import human.Client;

import java.util.Scanner;

public class OnLineBankMain {

    public static void main(String[] args) {

        BankOffice bankOffice = buildBankOffice();

        Client client1 = buildClient();

        DebitCard clientDebitCard1 = buildDebitCard1();

        DebitCard clientDebitCard2 = buildDebitCard2();

        DebitCard clientDebitCard3 = buildDebitCard3();

        int[] listOfPinCode = buildListPinCode(clientDebitCard1, clientDebitCard2, clientDebitCard3);

        AccStatement clientStatement1 = buildAccStatement1();

        AccStatement clientStatement2 = buildAccStatement2();

        AccStatement clientStatement3 = buildAccStatement3();

        String[] listOfClient = buildListClient(clientStatement1, clientStatement2, clientStatement3);

        printGreeting();

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

    private static void printListOfClientsListOfPinCode(int[] listOfPinCode, String[] listOfClient) {
        System.out.println("Вывод с помощью команды for списка клиентов из массива listOfClient[]: ");
        for (int i = 0; i <= 2; i++) {
            System.out.println(listOfClient[i]);
        }
        System.out.println();

        System.out.println("Вывод с помощью команды while списка пин-кодов из массива listOfPinCode[]: ");
        int i = 0;
        while (true) {
            System.out.println("Строка №" + listOfPinCode[i]);
            if (i >= 2) {
                break;
            }
            i++;
        }
        System.out.println();
    }

    private static boolean printPopolnenieAccount(DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3, AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3, Scanner scanner) {
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

    private static void printCreateNewAccount() {
        System.out.println("Открытие счета... (метод в разработке)");
        return;
    }

    private static void printBalance(BankOffice bankOffice, DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3, AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3, String[] listOfClient, Scanner scanner) {
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

    private static void printGreeting() {
        System.out.println("Здравствуйте!");
        System.out.println("Вас приветствует онлайн-сервис, " + buildBankOffice().getBankName() + ".");
        System.out.println("Выберите услугу, которую вы хотите получить:");
        System.out.println("Запросить баланс по карте нажмите: 1");
        System.out.println("Открыть счет нажмите: 2");
        System.out.println("Пополнить счет нажмите: 3");
        System.out.println("Чтобы посмотреть работу с массивами: 4");
    }

    private static String[] buildListClient(AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3) {
        String[] listOfClient = new String[3];
        // Объявление массива, в котором будут храниться строковые значения, с названием listOfClient, состоящим из 3 ячеек.

        listOfClient[0] = clientStatement1.getNameOfRecipient();
        listOfClient[1] = clientStatement2.getNameOfRecipient();
        listOfClient[2] = clientStatement3.getNameOfRecipient();
        // заполняем ячейки массива
        return listOfClient;
    }

    private static AccStatement buildAccStatement3() {
        AccStatement clientStatement3 = new AccStatement("Рублевый", "Потанин Александр Олегович", 123456, 1089321.13, "Выписка по дебетовой карте", 2, "09.01.2022");
        //создание объекта класса AccStatement с заполненными атрибутами.//
        return clientStatement3;
    }

    private static AccStatement buildAccStatement2() {
        AccStatement clientStatement2 = new AccStatement("Рублевый", "Петров Сергей Вячеславович", 123456, 201600.51, "Выписка по дебетовой карте", 1, "09.01.2022");
        //создание объекта класса AccStatement с заполненными атрибутами.//
        return clientStatement2;
    }

    private static AccStatement buildAccStatement1() {
        AccStatement clientStatement1 = new AccStatement("Рублевый", "Иванов Дмитрий Сергеевич", 123456, 75699.50, "Выписка по дебетовой карте", 0, "09.01.2022");
        //создание объекта класса AccStatement с заполненными атрибутами.//
        return clientStatement1;
    }

    private static int[] buildListPinCode(DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3) {
        int[] listOfPinCode = new int[3];
        // Объявление массива, в котором будут храниться числовые значения примитивного класса, с названием listOfPinCode, состоящим из 3 ячеек.

        listOfPinCode[0] = clientDebitCard1.getPinCode();
        listOfPinCode[1] = clientDebitCard2.getPinCode();
        listOfPinCode[2] = clientDebitCard3.getPinCode();
        // заполняем ячейки массива listOfPinCode.
        return listOfPinCode;
    }

    private static DebitCard buildDebitCard3() {
        DebitCard clientDebitCard3 = new DebitCard("3333 3333 3333 3333", "07/21", 5454, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //
        return clientDebitCard3;
    }

    private static DebitCard buildDebitCard2() {
        DebitCard clientDebitCard2 = new DebitCard("2222 2222 2222 2222", "06/21", 3535, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //
        return clientDebitCard2;
    }

    private static DebitCard buildDebitCard1() {
        DebitCard clientDebitCard1 = new DebitCard("1111 1111 1111 1111", "05/21", 1515, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //
        return clientDebitCard1;
    }

    private static Client buildClient() {
        Client client1 = new Client("Иванов Дмитрий Сергеевич", 35, "мужчина", 800);
        //создание объекта клиент класса Client с заполненными атрибутами //
        return client1;
    }

    private static BankOffice buildBankOffice() {
        BankOffice bankOffice = new BankOffice("Банк нового поколения", "г. Москва");
        //создание объекта класса BankOffice с заполненными атрибутами. //
        return bankOffice;
    }

}

