//package src.main.java;
//import java.util.*;
//public class Seminar4 {
//    static  Scanner scanner = new Scanner(in);
//    public static void printPrompt () {
//        System.out.println(
//                """
//                Нажмите '0' если вы хотите выйти из режима набора данных
//                Нажмите '1' если хотите вводить "данные"
//                Нажмите '2' если хотите осортировать по возрасту
//                Нажмите '3' если хотите отсортировать по возрасту и полу одновременно
//
//                """);
//    }
//
//    public static String getOperation() {
//        String operation = scanner.nextLine();
//
//
//    }
//
//        {   public static String surname() {
//            System.out.println("Input surname: ");
//            return scanner.nextLine();
//        }
//            System.out.println("Некорректный ввод, попробуй еще раз: ");
//            operation = scanner.nextLine();
//        }
//        return operation;
//    }
//
//    public static String surname() {
//        System.out.println("Input surname: ");
//        return scanner.nextLine();
//    }
//    public static LinkedList<String> surnameList (String surname) {
//        LinkedList surnameList = new LinkedList<>();
//        surnameList.add(surname);
//        return surnameList;
//    }
////        while (!Objects.equals(operation, "0")) {
////            int count = -1;
////            if (Objects.equals(operation, "1")) {
////                System.out.println("Ввод данных: ");
////
////                LinkedList<String> surname = new LinkedList<>();
////                surname.add(surname());
////                System.out.println(surname);
////
////                LinkedList<String> name = new LinkedList<>();
////                name.add(name());
////
////                LinkedList<String> middleName = new LinkedList<>();
////                middleName.add(middleName());
////
////                LinkedList<String> gender = new LinkedList<>();
////                gender.add(gender());
////
////                LinkedList<Integer> age = new LinkedList<>();
////                age.add(age());
////                count ++;
////                LinkedList<Integer> id = new LinkedList<>();
////                id.add(count);
////            } else
////                System.out.println("Некорректный ввод");
////        }
////        System.out.println("Выход из программы");
////    }
//
//
//            //id.add(id(id));
//
//
//    public static String name() {
//        System.out.println("Input name: ");
//        return scanner.nextLine();
//    }
//
//    public static String middleName() {
//        System.out.println("Input middle name: ");
//        return scanner.nextLine();
//    }
//
//    public static String gender() {
//        System.out.println("Input gender: ");
//        return scanner.nextLine();
//    }
//
//    public static int age() {
//        System.out.println("Input age: ");
//        return Integer.parseInt(scanner.nextLine());
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        String operation = "";
//        while (!Objects.equals(operation, "0")) {
//            printPrompt();
//            operation = getOperation();
//
//        }
//
//    }
//}
//
//
//
