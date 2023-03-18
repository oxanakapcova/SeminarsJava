package src.main.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Hometask4 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
    //
    //Реализуйте очередь с помощью LinkedList со следующими методами:
    //• enqueue() — помещает элемент в конец очереди,
    //• dequeue() — возвращает первый элемент из очереди и удаляет его,
    //• first() — возвращает первый элемент из очереди, не удаляя.
    //
    //В калькулятор добавьте возможность отменить последнюю операцию.
    public static void main(String[] args) {
        LinkedList<String> surnameList = new LinkedList<>();
        LinkedList<Integer> ageList = new LinkedList<>();
        LinkedList<Integer> idList = new LinkedList<>();
        surnameList.add("Ivanov");
        surnameList.add("Petrov");
        ageList.add(43);
        ageList.add(1);
        int count = 0;
        idList.add(count);
        count++;
        idList.add(count);
        System.out.println(idList);
        Collections.sort(ageList); // sorted
        System.out.println(ageList);
        System.out.println(idList);
    }
}
