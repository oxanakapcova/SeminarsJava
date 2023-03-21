package src.main.java;

import java.util.*;

public class Hometask3 {
    //2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static ArrayList<Integer> getArrayList(int size) {
        Random random = new Random();
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int value = random.nextInt(0, 10);
            testList.add(value);
        }
        return testList;
    }
    public static ArrayList<Integer> removeEven(ArrayList<Integer> yourList) {
        yourList.removeIf(n -> n % 2 == 0); // вместо цикла while & iterator
        return yourList;
    }

    //3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

    public static int findMin(ArrayList<Integer> yourList) {
        return Collections.min(yourList);
    }
    public static int findMax(ArrayList<Integer> yourList) {
        return Collections.max(yourList);
    }

    public static float findAverage(ArrayList<Integer> yourList) {
        float sum = 0;
        Iterator <Integer> iterator = yourList.iterator();
        while (iterator.hasNext()) {
            float n = iterator.next(); // int?
            sum += n;
        } // можно через цикл foreach
        return sum/yourList.size();
    }

    //4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
    public static ArrayList<Integer> concatanationArrayLists (ArrayList <Integer> first, ArrayList <Integer> second) {
                 second.removeAll(first);
                 first.addAll(second);
                 return first;
    }

    //5. Создать ArrayList<Integer> и добавить yektdsv 'ktvtynjv yjkm 10000 раз.
    public static Object repeat (ArrayList<Integer> yourArray,String whatToAdd, int count) {
        ArrayList newList = new ArrayList(yourArray);
        for (int i = 0; i < yourArray.size()+count; i++) {
            newList.add(whatToAdd);
        }
    return newList;
    }

    // 6. Повторить пятый пункт но с LinkedList.
    public static Object repeatLinked (LinkedList<Integer> yourLinkedList, String  whatToAdd, int count) {
        ArrayList newList = new ArrayList(yourLinkedList);
        for (int i = 0; i <yourLinkedList.size()+count ; i++) {
        newList.add(whatToAdd);
        }
        return newList;
    }

    // 7. замер и сравнение времени
    public static long checkTimeArrayList (ArrayList<Integer> arrayList) {
        long begin = System.currentTimeMillis();
        repeat(arrayList, "yektdsv 'ktvtynjv yjkm", 10000);
        long end = System.currentTimeMillis();
        return (end - begin);
    }
    public static long checkTimeLinked (LinkedList<Integer> linkedList) {
        long begin = System.currentTimeMillis();
        repeatLinked(linkedList, "yektdsv 'ktvtynjv yjkm", 10000);
        long end = System.currentTimeMillis();
        return (end - begin);
    }
    public static void main(String[] args) {
        int size = 10;
        ArrayList <Integer> testList = getArrayList(size);
        ArrayList <Integer> newList = getArrayList(size);
        LinkedList <Integer> linkedList = new LinkedList<>(newList);
        System.out.println("Test List: " + testList);
        System.out.println("Min: " + findMin(testList));
        System.out.println("Max: " + findMax(testList));
        System.out.println("Average: " + findAverage(testList));
        System.out.println("New List: " + newList);
        System.out.println("Concatened List: " + concatanationArrayLists(testList, newList));
        System.out.println("Without even values: " + removeEven(testList));
        System.out.println(repeat(newList, "yektdsv 'ktvtynjv yjkm", 12));// для печати убавлено
        System.out.println(repeatLinked(linkedList, "yektdsv 'ktvtynjv yjkm", 12));
        System.out.println("time for Array List: " + checkTimeArrayList(newList));
        System.out.println("time for Linked List: " + checkTimeLinked(linkedList));
    }


}
