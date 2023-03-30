package src.main.java;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sem04 {

        static LinkedList<ArrayList<String>> contacts = new LinkedList<>();
        static Scanner myScanner = new Scanner(System.in);
        public static void main(String[] args) {
            GetData();
            PrintContact();
            Comparator<ArrayList<String>> cmprAge = new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                    return Integer.compare(Integer.parseInt(t1.get(3)), Integer.parseInt(t2.get(3)));
                }
            };
            System.out.println("Сортировка по году Рождения");
            contacts.sort(cmprAge);
            PrintContact();
            Comparator<ArrayList<String>> cmprGender = new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                    return Character.compare(t1.get(4).charAt(0), t2.get(4).charAt(0));
                }
            };
            System.out.println("Сортировка по полу");
            contacts.sort(cmprGender);
            PrintContact();
        }
        //   1
        public static void GetData() {
            String command;
            System.out.println("Введите '1' для новой записи \nВведите '2' для завершения ввода данных\n ");
            command = myScanner.nextLine();
            while (command.equals("1")){
                contacts.add(GetRecord());
                System.out.println("Введите '1' для новой записи \nВведите '2' для завершения ввода данных\n ");
                command = myScanner.nextLine();
            }
        }
        private static void PrintContact(){
            for (ArrayList<String> record:
                    contacts){
                System.out.print(record.get(0)+ " ");
                System.out.print(record.get(1).toUpperCase().charAt(0) + ".");
                System.out.print(record.get(2).toUpperCase().charAt(0) + ".");
                System.out.print(record.get(3)+ ".");
                System.out.println(record.get(4));
            }
        }
        private static ArrayList<String> GetRecord(){
            ArrayList<String> newRecord = new ArrayList<>();
            System.out.print("Введите Фамилию");
            String lastName = myScanner.nextLine();
            newRecord.add(lastName);
            System.out.println("Введите Имя");
            String firstName = myScanner.nextLine();
            newRecord.add(firstName);
            System.out.println("Введите Отчество");
            String middleName = myScanner.nextLine();
            newRecord.add(middleName);
            System.out.println("Введите Год Рождения");
            String age = myScanner.nextLine();
            newRecord.add(age);
            System.out.println("Введите пол");
            String gender = myScanner.nextLine();
            newRecord.add(gender);
            return newRecord;
        }

}
