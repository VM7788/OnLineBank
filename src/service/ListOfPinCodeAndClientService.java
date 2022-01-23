package service;

public class ListOfPinCodeAndClientService {


    public static void printListOfClientsListOfPinCode(int[] listOfPinCode, String[] listOfClient) {
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
}
