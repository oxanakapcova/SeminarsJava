package src.main.java;
import amount.Entry;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMaps {
    // метод генерирует тел числа случайным образом
    public static String generator() {
        int num1, num2, num3, amount;
        int set2, set3;
        Random generator = new Random();
        num1 = generator.nextInt(1,10);
        num2 = generator.nextInt(10);
        num3 = generator.nextInt(10);
        set2 = generator.nextInt(100, 1000);
        set3 = generator.nextInt(1000, 10000);
        amount = generator.nextInt(100);
        return "8-(" + num1 + num2 + num3 + ")-" + set2 + "-" + set3 + " звонили " + amount + " раз(а)";
    }

 public static void printBook(Map<String, List<String>> hm) {
     for (var item : hm.entrySet()) {
         StringBuilder phones = new StringBuilder();
         for (String el : item.getValue()) {
             phones.append(el);
             phones.append("; ");
         }
         System.out.println(item.getKey() + ": " + phones);
     }
 }

    static HashMap<String, List<String>> phBook = new HashMap<>();
    public static void main(String[] args) {
        //может добавлять сколько угодно телефонов
        phBook.put("Иван Иванов", List.of(generator(), generator()));
        phBook.put("Светлана Петрова", List.of(generator()));
        phBook.put("Кристина Белова", List.of(generator()));
        phBook.put("Анна Мусина", List.of(generator(), generator(), generator()));
        phBook.put("Анна Крутова", List.of(generator()));
        phBook.put("Иван Юрин", List.of(generator()));
        phBook.put("Петр Лыков", List.of(generator(), generator()));
        phBook.put("Павел Чернов", List.of(generator()));
        phBook.put("Петр Чернышов", List.of(generator()));
        phBook.put("Мария Федорова", List.of(generator()));
        phBook.put("Марина Светлова", List.of(generator(), generator(), generator(), generator(), generator()));
        phBook.put("Мария Рыкова", List.of(generator()));
        phBook.put("Марина Лугова", List.of(generator()));
        phBook.put("Анна Владимирова", List.of(generator()));
        phBook.put("Иван Мечников", List.of(generator()));
        phBook.put("Петр Петин", List.of(generator(), generator()));
        phBook.put("Иван Ежов", List.of(generator(), generator(), generator()));
        //printBook(phBook);
        //положили все ключи в созданный массив строк
        String[] listName = new String[phBook.size()];
        phBook.keySet().toArray(listName);
        // обрезаем фамилии чтобы сравнить имена
        for (int i = 0; i < listName.length; i++) {
            listName[i] = listName[i].substring(0, listName[i].indexOf(" "));
            //System.out.println(listName[i]);
        }
        List<String> list = Arrays.asList(listName);
        //собираем элементы листа в мап,ключ-строка, значение - число, суммируем количество вхождений
        Map<String, Integer> amount = list.stream().collect(Collectors.toMap(e->e, e->1, Integer::sum));
        //вывод на печать
        amount.forEach((k,v)-> System.out.println("Имя " + k + " встречается " + v + " раз(а)"));

        //сортировка по имени
        Map<String, Integer> sortedMap = amount.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        System.out.println("========Сортировка по количеству повторов имен: ");
        sortedMap.entrySet().forEach(System.out::println);

        // выведет по алфавиту первоначальный список с телефонами
        TreeMap<String, List<String>> trBook = new TreeMap<>(phBook);
        System.out.println("==================================================");
        printBook(trBook);
    }

}
