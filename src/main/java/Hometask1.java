import java.util.Random;
import java.util.ArrayList;
// делаем дз и разбиваем на методы в одном классе
public class Hometask1 {
    // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int getBinaryLength(int number) {
        number = Integer.toBinaryString(number).length();
        return number;
    }

    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static int[] getArrayDivider(int divider, int startNumber, int lastNumber) {
        // находим первое число соответствующее заданному условию
        int firstNumber = startNumber % divider == 0 ? startNumber : startNumber + divider - startNumber % divider;
        // макс длина массива
        int len = lastNumber - firstNumber + 1;
        int[] result = new int[len];
        for (int i = 0; i < len; i++)
            result[i] = firstNumber + divider * i;
        return result;
    }
    // 4. Найти все НЕкратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    // использую класс arrayList (динамический массив с возможностью добавления и удаления элементов)

    public static Integer[] getArrayNotDivider(int divider, int lastNumber) {
        ArrayList<Integer> getArray = new ArrayList<>();
        for (int i = lastNumber; i >= Short.MIN_VALUE; i--) {
            if (i % divider != 0) {
                getArray.add(i);
            }
        }
        Integer[] array = new Integer[getArray.size()];
        getArray.toArray(array);
        return array;
    }


    // распечатать массив
    public static void printIntegerArray(Integer[]yourArray) {
        for (int j : yourArray) {
            System.out.println(j);
        }
    }
    public static void printArray(int[]yourArray) {
        for (int j : yourArray) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
       int i = randomInt(0, 2000);
       System.out.println("i = "+ i);
       int n = getBinaryLength(i);
       System.out.println("n = "+ n);
       int[] m1 = getArrayDivider(n, i, Short.MAX_VALUE);
       printArray(m1);
       System.out.println("==============================================");
       Integer[] m2 = getArrayNotDivider(n, i);
       printIntegerArray(m2);
    }
}