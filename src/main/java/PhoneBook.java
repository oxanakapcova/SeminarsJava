package src.main.java;
import java.util.*;
import java.util.LinkedList;
public class PhoneBook {
    static LinkedList<LinkedList<String>> phoneBook = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void printPrompt() {
        System.out.println(
                """
                        Нажмите '0' если вы хотите выйти\s
                        Нажмите '1' если хотите вводить данные
                        Нажмите '2' если хотите отсортировать по возрасту
                        Нажмите '3' если хотете отортировать по полу и возрасту одновременно
                        Нажмите '4' если хотите вывести на экран без сортировки
                                    """);
    }

    public static String getOperation() {
        String operation = scanner.nextLine();
        while (!Objects.equals(operation, "0") & !Objects.equals(operation, "1")
                & !Objects.equals(operation, "2") & !Objects.equals(operation, "3")
                & !Objects.equals(operation, "4")
        ) {
            System.out.println("Некорректный ввод, попробуй еще раз: ");
            operation = scanner.nextLine();
        }
        return operation;
    }

    public static void printContact() {
        for (LinkedList<String> contact : phoneBook) {
            System.out.print(contact.get(0) + " ");
            System.out.print(contact.get(1).toUpperCase().charAt(0) + ". ");
            System.out.print(contact.get(2).toUpperCase().charAt(0) + ". ");
            System.out.print(contact.get(3) + " ");
            System.out.println(contact.get(4));
        }
    }

    public static LinkedList<String> getContact() {
        LinkedList<String> newContact = new LinkedList<>();
        System.out.println("Введите фамилию: ");
        newContact.add(scanner.nextLine());
        System.out.println("Введите имя: ");
        newContact.add(scanner.nextLine());
        System.out.println("Введите отчество: ");
        newContact.add(scanner.nextLine());
        System.out.println("Введите возраст: ");
        newContact.add(scanner.nextLine());
        System.out.println("Введите пол: ");
        newContact.add(scanner.nextLine());
        return newContact;
    }

    static LinkedList<Integer> idList = new LinkedList<>();

    public static void doOperation(String operation) {
        switch (operation) {
            case "1" -> phoneBook.add(getContact());
            case "4" -> {
                System.out.println(phoneBook); // для удобства разработчика, можно убрать
                printContact();
            }
            case "2" -> {
                for (int i = 0; i < idList.size(); i++) {
                    idList.set(i, Integer.parseInt(phoneBook.get(i).get(3)));
                    System.out.println("i =" + i);
                    System.out.println("меняем на " + Integer.parseInt(phoneBook.get(i).get(3)));
                }
                System.out.println(idList);
            }
        }
    }

    public static void main(String[] args) {
        String operation = "";
        while (!Objects.equals(operation, "0")) {
            printPrompt();
            operation = getOperation();
            doOperation(operation);

        }
        System.out.println("Выход из программы");
    }


}