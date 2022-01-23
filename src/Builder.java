import account.AccStatement;
import card.DebitCard;
import human.Client;

public class Builder {
    public static String[] buildListClient(AccStatement clientStatement1, AccStatement clientStatement2, AccStatement clientStatement3) {
        String[] listOfClient = new String[3];
        // Объявление массива, в котором будут храниться строковые значения, с названием listOfClient, состоящим из 3 ячеек.

        listOfClient[0] = clientStatement1.getNameOfRecipient();
        listOfClient[1] = clientStatement2.getNameOfRecipient();
        listOfClient[2] = clientStatement3.getNameOfRecipient();
        // заполняем ячейки массива
        return listOfClient;
    }

    public static AccStatement buildAccStatement3() {
        AccStatement clientStatement3 = new AccStatement("Рублевый", "Потанин Александр Олегович", 123456, 1089321.13, "Выписка по дебетовой карте", 2, "09.01.2022");
        //создание объекта класса AccStatement с заполненными атрибутами.//
        return clientStatement3;
    }

    public static AccStatement buildAccStatement2() {
        AccStatement clientStatement2 = new AccStatement("Рублевый", "Петров Сергей Вячеславович", 123456, 201600.51, "Выписка по дебетовой карте", 1, "09.01.2022");
        //создание объекта класса AccStatement с заполненными атрибутами.//
        return clientStatement2;
    }

    public static AccStatement buildAccStatement1() {
        AccStatement clientStatement1 = new AccStatement("Рублевый", "Иванов Дмитрий Сергеевич", 123456, 75699.50, "Выписка по дебетовой карте", 0, "09.01.2022");
        //создание объекта класса AccStatement с заполненными атрибутами.//
        return clientStatement1;
    }

    public static int[] buildListPinCode(DebitCard clientDebitCard1, DebitCard clientDebitCard2, DebitCard clientDebitCard3) {
        int[] listOfPinCode = new int[3];
        // Объявление массива, в котором будут храниться числовые значения примитивного класса, с названием listOfPinCode, состоящим из 3 ячеек.

        listOfPinCode[0] = clientDebitCard1.getPinCode();
        listOfPinCode[1] = clientDebitCard2.getPinCode();
        listOfPinCode[2] = clientDebitCard3.getPinCode();
        // заполняем ячейки массива listOfPinCode.
        return listOfPinCode;
    }

    public static DebitCard buildDebitCard3() {
        DebitCard clientDebitCard3 = new DebitCard("3333 3333 3333 3333", "07/21", 5454, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //
        return clientDebitCard3;
    }

    public static DebitCard buildDebitCard2() {
        DebitCard clientDebitCard2 = new DebitCard("2222 2222 2222 2222", "06/21", 3535, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //
        return clientDebitCard2;
    }

    public static DebitCard buildDebitCard1() {
        DebitCard clientDebitCard1 = new DebitCard("1111 1111 1111 1111", "05/21", 1515, "Дебетовая");
        //создание объекта дебетовой карты класса DebitСard с заполненными атрибутами //
        return clientDebitCard1;
    }

    public static Client buildClient() {
        Client client1 = new Client("Иванов Дмитрий Сергеевич", 35, "мужчина", 800);
        //создание объекта клиент класса Client с заполненными атрибутами //
        return client1;
    }


}
