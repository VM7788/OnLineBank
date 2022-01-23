package service;

import BankOffice.BankOffice;
import account.AccStatement;

public class StatementService {



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
