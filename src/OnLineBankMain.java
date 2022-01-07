import account.AccStatement;
import card.DebitCard;
import human.Client;


import java.util.Scanner;


public class OnLineBankMain {


    public static void main(String[] args) {

        int a = 1;

        BankOffice bankOffice = new BankOffice("Банк нового поколения", "г. Москва");
        //создание объекта класса BankOffice с заполненными атрибутами. //


        Client client1 = new Client("Иванов Дмитрий Сергеевич", 35, "мужчина", 800);
        //создание объекта клиент класса Client с заполненными атрибутами //


        DebitCard clientDebitCard1 = new DebitCard("1111 1111 1111 1111", "05/21", 1515, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //


        AccStatement clientStatement1 = new AccStatement("Рублевый", "Иванов Дмитрий Сергеевич", 123456, 75699.50, "Выписка по дебетовой карте", 0, "26.12.2021");
        //создание объекта класса AccStatement с заполненными атрибутами.//

        System.out.println("Здравствуйте!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы войти в банк, нажмите любую клавишу.");
        String enter = scanner.nextLine();
        /* Справка для себя: Метод nextLine() обращается к источнику данных (нашему тексту), находит там следующую строку,
         которую он еще не считывал (в нашем случае — первую) и возвращает ее.*/

        System.out.println("Выберите услугу, которую вы хотите получить:");
        System.out.println("Запросить баланс по карте нажмите: 1");
        System.out.println("Открыть счет нажмите: 2");
        System.out.println("Пополнить счет нажмите: 3");
        int b = scanner.nextInt();

        switch (b) {
            case 1:
                System.out.println("Введите номер карты:");
                String enter2 = scanner.nextLine();
                String numOfCard = scanner.nextLine();

                System.out.println("Введите дату выпуска карты (месяц/год в формате **/**:)");
                String dateOfIssue = scanner.nextLine();

                System.out.println("Введите четырехзначный pin карты:");

                int pinCode = scanner.nextInt(); // при выполнении данной строки сканнер считывает вводимые с клавиатуры цифры,затем
                // данный набор цифр (пин код) сохраняется в переменную примитивного типа int с названием scanner.
                System.out.println();

                clientDebitCard1.speak();
                System.out.println();

                if (pinCode == clientDebitCard1.getPinCode()) {
                    System.out.println(clientStatement1.getNameOfAcc());
                    System.out.println("номер выписки №" + ' ' + clientStatement1.getNumberOfAccStatement() + 1);
                    System.out.println("дата выписки" + ' ' + clientStatement1.getDateOfAccStatement());
                    System.out.println("средств на карте: " + clientStatement1.getBalanceOfRecipientAcc() + " рублей");
                    System.out.println(bankOffice.getBankName());
                    System.out.println(bankOffice.getBankAddress());
                } else {
                    System.out.println("Пин код неверный.");
                }
                break;


            case 2:
                System.out.println("Открытие счета");
                break;

            case 3:
                System.out.println("Пополнение счета");
                System.out.println("Введите сумму: ");
                double c = scanner.nextDouble();
                c = (c + clientStatement1.getBalanceOfRecipientAcc());
                System.out.println("Баланс карты составляет: " + c);
                break;


            default:
                System.out.println("-");

        }

//        if (b > 1) {
//            if (b == 2) {
//                System.out.println("Открытие счета");
//            }
//            if (b == 3) {
//
//                System.out.println("Пополнение счета");
//                System.out.println("Введите сумму: ");
//                double c = scanner.nextDouble();
//
//                c = (double) (c + clientStatement1.getBalanceOfRecipientAcc());
//
//                System.out.println("Баланс карты составляет: " + c);
//            }
//
//
//        } else {
//            if (b == 1) {
//
//                System.out.println("Введите номер карты:");
//                String numOfCard = scanner.nextLine();
//
//                System.out.println("Введите дату выпуска карты (месяц/год в формате **/**:)");
//                String dateOfIssue = scanner.nextLine();
//
//                System.out.println("Введите четырехзначный pin карты:");
//
//                int pinCode = scanner.nextInt(); // при выполнении данной строки сканнер считывает вводимые с клавиатуры цифры,затем
//                // данный набор цифр (пин код) сохраняется в переменную примитивного типа int с названием scanner.
//                System.out.println();
//
//                if (pinCode == clientDebitCard1.getPinCode()) {
//                    System.out.println(clientStatement1.getNameOfAcc());
//                    System.out.println("номер выписки №" + ' ' + clientStatement1.getNumberOfAccStatement() + 1);
//                    System.out.println("дата выписки" + ' ' + clientStatement1.getDateOfAccStatement());
//                    System.out.println("средств на карте: " + clientStatement1.getBalanceOfRecipientAcc() + " рублей");
//                    System.out.println(bankOffice.getBankName());
//                    System.out.println(bankOffice.getBankAddress());
//                } else {
//                    System.out.println("Пин код неверный.");
//                }
//            }
//
//        }


    }

}